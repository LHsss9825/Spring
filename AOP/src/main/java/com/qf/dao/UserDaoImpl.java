package com.qf.dao;

import org.springframework.stereotype.Repository;

//相当于<bean id="userDaoImpl" class="com.qf.dao.UserDaoImpl"/>
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(){
        System.out.println("insert into tb_user......");
    }
}