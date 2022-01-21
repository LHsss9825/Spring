package com.qf.web;

import com.qf.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac =
            new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ac.getBean("userServiceImpl",UserService.class);
        System.out.println("userService的类型："+userService.getClass());
        userService.addUser();
    }
}