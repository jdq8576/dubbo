package cn.edu.njtech.dubboservices2.service.impl;

import cn.edu.njtech.User;
import cn.edu.njtech.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author tim
 * @date 2022/9/18 4:23 下午
 */
@Slf4j
@DubboService(weight = 100)
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello() {
        return "Hello Dubbo!!!  ~";
    }

    @Override
    public User findUserById(int id) {
        return null;
    }
}
