package hci.artedu.service;

import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;


public interface UserService {
    ServerResponse<HashMap<String,Object>> login(User user);
    ServerResponse<String> register(User user, HttpServletRequest request, String verifyCode);
    ServerResponse<HashMap<String,Object>> login(User user, HttpSession session);
    ServerResponse<String> register(User user);
    int add(User user);
    ServerResponse<String> delete(User user);
    ServerResponse<String> modify(User user);
    ServerResponse<List<User>> getAllUser();
    public User findUserById(int id);
    public ServerResponse<String> logout(int uid,HttpSession session);
    public void insertLoginLog(int uid);
    public void insertLogoutLog(int uid);
}
