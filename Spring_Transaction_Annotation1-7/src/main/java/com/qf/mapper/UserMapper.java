package com.qf.mapper;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public void addUser(User user);
    void updateUserofSub(@Param("source")String source,@Param("money")String money);
    void updateUserofAdd(@Param("add")String add,@Param("money")String money);
}
