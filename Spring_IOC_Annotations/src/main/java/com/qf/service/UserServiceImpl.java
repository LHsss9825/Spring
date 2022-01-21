package com.qf.service;

import com.qf.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


//相当于<bean id="userServiceImpl" class="com.qf.service.UserServiceImpl"/>
@Service
public class UserServiceImpl implements UserService {

    //@Resource(name="userDaoImpl")//按名称注入
@Autowired
    private UserDao userDao;
@Value("${name}")
private String name;
@Value("${age}")
private Integer age;
    @Override
    public void addUser(){
        System.out.println(name+":"+age);
    }
}