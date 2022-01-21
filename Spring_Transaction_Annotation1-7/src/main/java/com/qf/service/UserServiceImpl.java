package com.qf.service;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PlatformTransactionManager platformTransactionManager;


    @Override
    public void addUser(User user) {
        userMapper.addUser(user);

    }
@Transactional
    @Override
    public void updateUser(String source, String add, String money) {


        userMapper.updateUserofSub(source, money);
//        int a = 6 / 0;
        userMapper.updateUserofAdd(add, money);

    }

}
