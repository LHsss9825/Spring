package com.qf.factory;

import com.qf.dao.UserDao;
import com.qf.dao.UserDaoImpl;
import com.qf.service.UserService;
import com.qf.service.UserServiceImpl;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
//
public class BeanFactory_V1 {
    public static UserDao getUserDao(){
        return  new UserDaoImpl();
    }
  public static UserService getUserService(){
        return new UserServiceImpl();
  }

}
