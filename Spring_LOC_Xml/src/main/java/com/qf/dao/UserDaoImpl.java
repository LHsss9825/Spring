package com.qf.dao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("userdao被加载了");
    }

    @Override
    public void addUser(){
        System.out.println("insert into tb_user......");
    }
}