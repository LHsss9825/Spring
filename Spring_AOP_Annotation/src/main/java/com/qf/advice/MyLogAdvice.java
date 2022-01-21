package com.qf.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
//@Aspect//对切点表达式的支持
//切面
public class MyLogAdvice {
    @Before("execution(* com.qf.service.*.*(..))")//切点
    public void before(){//增强
        System.out.println("前置方法被执行了");
    }
}
