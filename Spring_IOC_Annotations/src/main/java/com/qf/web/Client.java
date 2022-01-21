package com.qf.web;

import com.qf.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
          ca.getBean("userServiceImpl", UserService.class).addUser();
    }


}
