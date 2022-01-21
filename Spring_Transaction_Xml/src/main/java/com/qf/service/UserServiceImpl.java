package com.qf.service;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    //@Autowired
//   private TransactionDefinition transactionDefinition;
    @Autowired
    private PlatformTransactionManager platformTransactionManager;
    //转账需要用到的三个注解
    //@param source
    //@param target1
    //param money
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
    @Override
    public void updateUser(String source, String add, String money) {
//        TransactionStatus transaction = platformTransactionManager.getTransaction(transactionDefinition);
//        try {

        userMapper.updateUserofSub(source, money);
            int a=6/0;
        userMapper.updateUserofAdd(add, money);
//            platformTransactionManager.commit(transaction);
//        }catch (Exception e){
////            platformTransactionManager.rollback(transaction);
//            e.printStackTrace();
//        }
    }

}
