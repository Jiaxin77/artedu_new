package hci.artedu.service;

import hci.artedu.pojo.User;

/**
 * @program: artedu
 * @description: Token
 * @author: Leaf
 * @create: 2020-10-27 09:59
 * @Version: 1.0
 **/
public interface TokenService {
    String getToken(User user);
}

