package com.qf.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(){
        System.out.println("insert into tb_user......");
    }
}