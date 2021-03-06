package hci.artedu.service.impl;

import com.alibaba.fastjson.JSONObject;
import hci.artedu.common.ServerResponse;
import hci.artedu.dao.UserMapper;
import hci.artedu.dao.UserloginlogMapper;
import hci.artedu.pojo.User;
import hci.artedu.pojo.UserExample;
import hci.artedu.pojo.Userloginlog;
import hci.artedu.service.TokenService;
import hci.artedu.service.UserService;
import hci.artedu.utils.DateUtils;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserloginlogMapper userloginlogMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @Override
    public ServerResponse<HashMap<String, Object>> login(User user, HttpSession session) {
        /**
         * @Author leaf
         * @Description 登录
         * @Date 11:12 上午 2019/11/15
         * @Param [username, password]
         * @return com.example.demo.common.ServerResponse<com.example.demo.pojo.UserList>
         **/
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());

        List<User> uList = userMapper.selectByExample(example);

        //if(!uList.isEmpty() && user.getUserPassword().equals(uList.get(0).getUserPassword())){
        if(!uList.isEmpty() && encoder.matches(user.getUserPassword(),uList.get(0).getUserPassword())){
                HashMap<String,Object> res = new HashMap<>();
                User thisuser = uList.get(0);

                //token
                String token = tokenService.getToken(thisuser);

                res.put("token",token);
                res.put("user",thisuser);

                //session
                session.setAttribute("user",thisuser);
                session.setAttribute("status","login");



                return ServerResponse.createBySuccess("登录成功",res);
            }
            else {
                //密码错误
                session.setAttribute("status","false");
                return ServerResponse.createByErrorMessage("登录失败");
            }
        }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)//增加事务回滚
    public ServerResponse<String> register(User user, HttpServletRequest request, String verifyCode) {

        /**
         * @Author jiaxin
         * @Description 注册
         * @Date 11:11 上午 2019/11/17
         * @Param [username, password]
         * @return com.example.demo.common.ServerResponse<java.lang.String>
         **/

        //User usered = userMapper.selectByUserName(user.getUserName());
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(user.getUserName());
        List<User> uList = userMapper.selectByExample(example);
        if (!uList.isEmpty()) {
            return ServerResponse.createByErrorMessage("昵称重复，注册失败");
        }
        /*JSONObject json = (JSONObject)request.getSession().getAttribute("verifyCode");
        if(!json.getString("verifyCode").equals(verifyCode)){
            return ServerResponse.createBySuccessMessage("验证码错误");
        }
        if((System.currentTimeMillis() - json.getLong("createTime")) > 1000 * 60 * 5) {
            return ServerResponse.createBySuccessMessage("验证码过期");
        }*/
        if (redisTemplate.hasKey(user.getPhoneNumber())) {
            if (!verifyCode.matches(redisTemplate.opsForValue().get(user.getPhoneNumber()))) {
                return ServerResponse.createByErrorMessage("验证码错误");
            }
        } else {
            return ServerResponse.createByErrorMessage("未发送验证码");
        }

        UserExample example2 = new UserExample();
        example2.createCriteria().andIpEqualTo(user.getIp());
        List<User> uList2 = userMapper.selectByExample(example2);
        if (uList2.size() == 0 || user.getIp() == null) {
            user.setUserPassword(encoder.encode(user.getUserPassword()));
            userMapper.insert(user);
            return ServerResponse.createBySuccessMessage("新用户注册成功");
        } else {
            user.setIp(uList2.get(0).getIp());
            user.setId(uList2.get(0).getId());
            user.setUserPassword(encoder.encode(user.getUserPassword()));
            userMapper.updateByPrimaryKeySelective(user);
            return ServerResponse.createBySuccessMessage("游客注册成功");
        }


    }

    public int add(User user) {
        return userMapper.insert(user);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public ServerResponse<String> check(String verifyCode, String phoneNo) {
        if (redisTemplate.hasKey(phoneNo)) {
            if (!verifyCode.matches(redisTemplate.opsForValue().get(phoneNo))) {
                System.out.println(redisTemplate.opsForValue().get(phoneNo));
                return ServerResponse.createByErrorMessage("验证码错误");
            }
        } else {
            return ServerResponse.createByErrorMessage("未发送验证码");
        }
        return ServerResponse.createBySuccessMessage("验证码校验成功");
    }

    @Transactional(propagation = Propagation.REQUIRED)//增加事务回滚
    public ServerResponse<String> delete(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(user.getUserName());
//        List<User> uList = userMapper.selectByExample(example);
        userMapper.deleteByExample(example);
        return ServerResponse.createBySuccessMessage("删除成功");
    }

    @Transactional(propagation = Propagation.REQUIRED)//增加事务回滚
    public ServerResponse<String> modify(User user){
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(user.getUserName());
        user.setUserPassword(encoder.encode(user.getUserPassword()));
        userMapper.updateByExample(user,example);
        return ServerResponse.createBySuccessMessage("修改成功");
    }


    public ServerResponse<List<User>> getAllUser()
    {
        UserExample userExample = new UserExample();
        List<User> userList = userMapper.selectByExample(userExample);
        return ServerResponse.createBySuccess("获取成功",userList);

    }
    public ServerResponse<User> getUser(int id)
    {

        User user = userMapper.selectByPrimaryKey(id);
        return ServerResponse.createBySuccess("获取成功",user);

    }

    @Override
    public User findUserById(int id)
    {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }



    @Override
    public ServerResponse<String> logout(int uid,HttpSession session)
    {
        User user = userMapper.selectByPrimaryKey(uid);
        String status = (String) session.getAttribute("status");
        System.out.println(status);

        if (status!= null &&status.equals("login")){//退出成功
            session.invalidate();
            return ServerResponse.createBySuccessMessage("成功登出");
        }else {//退出失败
            return ServerResponse.createByErrorMessage("未登录，登出失败");
        }

    }



    @Override
    public int insertLoginLog(int uid)
    {
        /**
         * @Author jiaxin
         * @Description 加入登录进去的日志//TODO
         * @Date 10:27 上午 2020/11/2
         * @Param [uid]
         * @return logid
         **/

        Userloginlog userloginlog = new Userloginlog();
        User user = userMapper.selectByPrimaryKey(uid);
        userloginlog.setUserId(user.getId());
        userloginlog.setUserName(user.getUserName());
        Timestamp loginTime = DateUtils.nowDateTime();
        userloginlog.setBeginTime(loginTime);
        userloginlogMapper.insert(userloginlog);
        return userloginlog.getId();


    }



    @Override
    public void insertLogoutLog(int id) {
        /**
         * @Author jiaxin
         * @Description 加入登出的日志//TODO
         * @Date 10:27 上午 2020/11/2
         * @Param [id] 记录id
         * @return int userid
         **/


        Userloginlog userloginlog = userloginlogMapper.selectByPrimaryKey(id);
        Timestamp logoutTime = DateUtils.nowDateTime();
        userloginlog.setEndTime(logoutTime);
        userloginlogMapper.updateByPrimaryKey(userloginlog);
        //时间差计算
        Date beginTime = userloginlog.getBeginTime();
        Date endTime = userloginlog.getEndTime();

        long login_time = beginTime.getTime();
        long logout_time = endTime.getTime();
        long timeSpan = logout_time - login_time;

        userloginlog.setDuringTime(timeSpan);

//        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
//        try {
//            String during_str = hour + ":" + min + ":" + s;
//            Date duringTime = df.parse(during_str);
//            userloginlog.setDuringTime(duringTime);
//            userloginlogMapper.updateByPrimaryKey(userloginlog);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int checkGuestIP(String ip) {
        /**
         * @Author myz
         * @Description 记录访问游客的ip地址
         * @Date 18:00 上午 2020/11/24
         * @Param [ip] 游客ip地址
         * @return int userid
         **/
        UserExample example = new UserExample();
        example.createCriteria().andIpEqualTo(ip);
        List<User> userList = userMapper.selectByExample(example);
        if (userList.size() == 0) {
            User user = new User();
            user.setIp(ip);
            userMapper.insert(user);
            return userMapper.selectByExample(example).get(0).getId();
        } else {
            return userList.get(0).getId();
        }
    }

/*
        Useroperation useroperation = new Useroperation();
        User user = userMapper.selectByPrimaryKey(uid);
        useroperation.setUserId(user.getId());
        useroperation.setUserName(user.getUserName());
        Timestamp logoutTime = DateUtils.nowDateTime();
        useroperation.setOperationTime(logoutTime);
        useroperation.setUserOperation("logout");
        useroperationMapper.insert(useroperation);

 */



}
