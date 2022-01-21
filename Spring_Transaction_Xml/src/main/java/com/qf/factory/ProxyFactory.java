package com.qf.factory;

import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//@Component
public class ProxyFactory {
    @Autowired
    private UserService userService;
    //事务管理平台
    @Autowired
    private PlatformTransactionManager transactionManager;
    //事务属性定义
    //@Autowired
    private TransactionDefinition transactionDefinition;

    public UserService getProxyFactoryObject() {
         return (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                 userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        TransactionStatus transaction = transactionManager.getTransaction(transactionDefinition);
                        try {

                            method.invoke(userService, args);
                           transactionManager.commit(transaction);
                        }catch (Exception e){
                            e.printStackTrace();
                            transactionManager.rollback(transaction);
                        }
                        return null;
                    }
                });
    }
}