package hci.artedu.controller;

import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.User;
import hci.artedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@RestController
//@RequestMapping(value = "/home")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param user
     * @return user信息
     */
    @PostMapping("/login")
    public ServerResponse<HashMap<String,Object>>  login(User user, HttpSession session){
        ServerResponse<HashMap<String,Object>> response = userService.login(user,session);

        return response;
    }


    /**
     * 注册
     *
     * @param user
     * @return
     */
    @PostMapping("/register")
    public ServerResponse<String> register(User user, HttpServletRequest request, String verifyCode, String phoneNo) {
        ServerResponse<String> response = userService.register(user, request, verifyCode, phoneNo);
        return response;
    }

    @PostMapping("/add")
    public int add(User user) {
        return userService.add(user);
    }

    @PostMapping("/delete")
    public ServerResponse<String> delete(User user) {
        return userService.delete(user);
    }

    @PostMapping("/modify")
    public ServerResponse<String> modify(User user) {
        return userService.modify(user);
    }

    @GetMapping("/getAllUser")
    public ServerResponse<List<User>> getAllUser()
    {
        return userService.getAllUser();
    }

    @PostMapping("/logout")
    public ServerResponse<String> logout(int uid,HttpSession session)
    {
        return userService.logout(uid,session);
    }
}
