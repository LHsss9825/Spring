package com.qf.web;


import com.qf.factory.BeanFactory_V3;
import com.qf.service.UserService;
import com.qf.service.UserServiceImpl;

/**
 * 控制层：servlet
 */
public class Client {
    public static void main(String[] args) {
        UserService userService = (UserService) BeanFactory_V3.getBean("UserService");
        userService.addUser();
        for (int i = 0; i < 5; i++) {
            userService = (UserService) BeanFactory_V3.getBean("UserService");
            System.out.println(userService);
        }
    }
}
