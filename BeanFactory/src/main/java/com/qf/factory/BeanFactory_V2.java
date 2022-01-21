package com.qf.factory;

import com.qf.dao.UserDao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanFactory_V2 {
    public static Object gertBean(String beanName) {
        try {
            InputStream is = BeanFactory_V2.class.getClassLoader().getResourceAsStream("beans.properties");
            Properties properties = new Properties();
            properties.load(is);
            return Class.forName(properties.getProperty(beanName)).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(BeanFactory_V2.gertBean("UserDao"));
    }
}