package com.qf;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
@Autowired
    private UserService userService;
@Autowired
  private DataSource dataSource;
@Test
    public void add(){
    userService.addUser(new User("金毛狮王",300F));
    userService.addUser(new User("青翼蝠王",900F));
}
@Test
    public void test(){
    System.out.println(dataSource);
}
}
