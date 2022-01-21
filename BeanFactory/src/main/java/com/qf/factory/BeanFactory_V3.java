package com.qf.factory;

import com.qf.dao.UserDao;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BeanFactory_V3 {
      private static Map<String,Object>beans=new HashMap<>();
  static {
      try{
          //2读取配置文件
          InputStream is = BeanFactory_V3.class.getClassLoader().getResourceAsStream("beans.properties");
          Properties properties = new Properties();
          properties.load(is);
           //3通过反射创建对象
          Set<Map.Entry<Object, Object>> entries = properties.entrySet();
          for (Map.Entry<Object, Object> entry : entries) {
              String key = entry.getKey().toString();
              String beansName = entry.getValue().toString();
              Object value = Class.forName(beansName).newInstance();
              beans.put(key,value);
          }
      }catch (Exception e){
          e.printStackTrace();
      }
  }
    //4使用时从容器里拿
    public static Object getBean(String beanName){
      return beans.get(beanName);
    }

    public static void main(String[] args) {

    }

}
