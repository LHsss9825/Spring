package com.qf.service;

import com.qf.dao.UserDao;
import com.qf.factory.BeanFactory_V3;

/**
 * 业务层：处理业务
 */
public class UserServiceImpl implements UserService {
    //硬编码：耦合度过高
    private UserDao userDao = (UserDao) BeanFactory_V3.getBean("UserDao");

    public void addUser() {
         userDao.addUser();
    }
}
