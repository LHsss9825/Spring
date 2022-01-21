package com.qf;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private UserService userService;
    @Autowired
    private DataSource dataSource;

    @Test
    public void add() {
        userService.addUser(new User("金毛狮王", "300"));
        userService.addUser(new User("青翼蝠王", "900"));
    }

    @Test
    public void test() {
        System.out.println(dataSource);
    }

    @Test
    public void updateTest() {
        System.out.println("userService的类型：" + userService.getClass());

        userService.updateUser("金毛狮王", "青翼蝠王", "1");

    }
}
