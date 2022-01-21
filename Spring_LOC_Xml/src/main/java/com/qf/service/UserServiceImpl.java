package com.qf.service;

import com.qf.dao.UserDao;
import com.qf.dao.UserDaoImpl;

import java.util.*;

public class UserServiceImpl implements UserService {
    //此处有依赖关系
    private UserDao userDao ;
    private String userName;
    private Set mySet;
    private List mylist;
    private String[] myStrs;
    private Map map;

    public UserServiceImpl() {
        System.out.println("调用构造方法创建bean。。。。。。。。。。。。。。。");
    }

    public void setMySet(Set mySet) {
        this.mySet = mySet;
    }

    public void setMylist(List mylist) {
        this.mylist = mylist;
    }

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }
    public  void init(){
        System.out.println("调用init实例化bean。。。。。。。。。。。");
    }

    public void setMap(Map map) {
        this.map = map;
    }
    public void destory(){
        System.out.println("调用destory方法销毁bean、、、、、、、、");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("调用set方法注入属性值。。。。。。。。。。");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void addUser(){
        System.out.println(userName);
        System.out.println(userDao);
        System.out.println("myset:"+mySet);
        System.out.println("mylist:"+mylist);
        System.out.println(   "mystrs:"+ Arrays.toString(myStrs));
        System.out.println("map:"+map);
        userDao.addUser();
    }
}