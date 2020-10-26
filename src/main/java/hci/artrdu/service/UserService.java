package hci.artrdu.service;

import hci.artrdu.common.ServerResponse;
import hci.artrdu.pojo.User;

import java.util.HashMap;
import java.util.List;


public interface UserService {
    ServerResponse<HashMap<String,Object>> login(User user);
    ServerResponse<String> register(User user);
    int add(User user);
    ServerResponse<String> delete(User user);
    ServerResponse<List<User>> getalluser();
    public User findUserById(int id);
}
