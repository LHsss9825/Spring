package com.qf.service;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    public void addUser(User user);
public void updateUser(String source,String add,String money);

}
