package cn.edu.njtech.dubboweb.controller;

import cn.edu.njtech.User;
import cn.edu.njtech.service.UserService;
import org.apache.dubbo.common.constants.LoadbalanceRules;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tim
 * @date 2022/9/18 4:36 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /*
        1. 从zookeeper注册中心获取userService的访问url
        2. 进行远程调用RPC
        3. 将结果封装为一个代理对象。给变量赋值
     */
    @DubboReference(loadbalance = LoadbalanceRules.ROUND_ROBIN)//远程注入
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return userService.sayHello();
    }

    @RequestMapping("/find")
    public User find(int id) {
        return userService.findUserById(id);
    }
}
