package com.qf.web;

import com.qf.dao.UserDao;
import com.qf.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = ac.getBean("userService", UserService.class);
//          userService.addUser();
          ac.close();



//            ApplicationContext  Beanfactory 测试
//        Beanfactory：顶级接口 什么时候调用 对象什么时候创建
//        ApplicationContext：在类加载是就创建了
//        BeanFactory fa = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        System.out.println("spring IOC容器被创建好了");
    }

}
