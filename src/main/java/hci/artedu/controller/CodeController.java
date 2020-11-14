package hci.artedu.controller;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.utils.StringUtils;
import com.zhenzi.sms.ZhenziSmsClient;
import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.User;
import hci.artedu.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
public class CodeController {
    /*//短信平台相关参数
    //这个不用改
    private String apiUrl = "https://sms_developer.zhenzikj.com";
    //榛子云系统上获取
    private String appId = "107057";

    private String appSecret = "22785fd4-019e-41c5-8a27-e2628b06044f";
    @GetMapping("/code")
    public String getCode(@RequestParam("memPhone") String memPhone, HttpSession httpSession){
        try {
            JSONObject json = null;
            //随机生成验证码
            String code = String.valueOf(new Random().nextInt(999999));

            ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
            System.out.println(code);
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("number", "13051867272");
            params.put("templateId", "2135");
            String[] templateParams = new String[2];
            templateParams[0] = code;
            templateParams[1] = "5分钟";
            params.put("templateParams", templateParams);
            String result = client.send(params);
            json = JSONObject.parseObject(result);
            System.out.println(result);
            if (json.getIntValue("code")!=0){//发送短信失败
                return  "false";
            }
            //将验证码存到session中,同时存入创建时间
            //以json存放，这里使用的是阿里的fastjson
            json = new JSONObject();
            json.put("memPhone",memPhone);
            json.put("code",code);
            json.put("createTime",System.currentTimeMillis());
            // 将认证码存入SESSION
            httpSession.setAttribute("code",json);
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return "False";
        }
    }*/

    @Autowired
    private CodeService sendMessage;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @RequestMapping("/code/{phone}")
    @ResponseBody
    public ServerResponse<String> codeSend(@PathVariable("phone") String phone) {
        String code = redisTemplate.opsForValue().get(phone);
        if (!StringUtils.isEmpty(code)) {
            return ServerResponse.createByErrorMessage(phone + ": " + code + "该验证尚未过期！");
        }
        code = String.valueOf(new Random().nextInt(999999)); //generate random verification code
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", code);
        ServerResponse flag = sendMessage.sendMessage(phone, map);
        if (flag.getStatus() == 0) {
            redisTemplate.opsForValue().set(phone, code, 15, TimeUnit.MINUTES);
            return ServerResponse.createBySuccessMessage(phone + " 发送成功！");
        }
        return ServerResponse.createByErrorMessage("发送失败");
    }


}