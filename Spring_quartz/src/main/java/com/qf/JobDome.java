package com.qf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class JobDome {
    public void start() {
        System.out.println("现在的时间：" + new Date());
    }

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
