package com.qf.advice;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Date;

public class MyLogAdvice {

    //前置通知
    public void before(){
        System.out.println("前置通知");
    }

    //后置通知【try】
    public void afterReturning(){
        System.out.println("后置通知");
    }

    //异常通知【catch】
    public void afterThrowing(){
        System.out.println("异常通知");
    }

    //最终通知【finally】
    public void after(){
        System.out.println("最终通知");
    }

    //环绕通知
    public void around(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("方法执行前的环绕通知");
            joinPoint.proceed();
            System.out.println("方法执行后的环绕通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}