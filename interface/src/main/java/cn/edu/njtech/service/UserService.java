package cn.edu.njtech.service;

import cn.edu.njtech.User;

/**
 * @author tim
 * @date 2022/9/18 4:18 下午
 */
public interface UserService {
    public String sayHello();

    public User findUserById(int id);
}
