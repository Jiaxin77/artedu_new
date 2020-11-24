package hci.artedu.service;

import hci.artedu.common.ServerResponse;
import hci.artedu.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;


public interface UserService {

    ServerResponse<String> register(User user, HttpServletRequest request, String verifyCode);

    ServerResponse<HashMap<String, Object>> login(User user, HttpSession session);
    int add(User user);
    ServerResponse<String> delete(User user);
    ServerResponse<String> modify(User user);
    ServerResponse<List<User>> getAllUser();
    ServerResponse<User> getUser(int id);
    User findUserById(int id);
    ServerResponse<String> logout(int uid, HttpSession session);
    int insertLoginLog(int uid);
    void insertLogoutLog(int uid) throws ParseException;

    int checkGuestIP(String ip);
}
