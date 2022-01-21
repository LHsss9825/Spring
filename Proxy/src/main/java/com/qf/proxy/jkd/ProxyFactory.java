package com.qf.proxy.jkd;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理角色：宋吉吉
public class ProxyFactory  {
private Object realObj;
public ProxyFactory(Object realObj){
    this.realObj =realObj;
}
public Object getRealObj(){
    return Proxy.newProxyInstance(realObj.getClass().getClassLoader(), realObj.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("方法执行前");
                    System.out.println("方法执行时");
                    Object invoke = method.invoke(realObj, args);
                    System.out.println("方法执行后");
                    System.out.println("结尾");
                    return invoke;
                }
            }

);
}

}
