package com.springtest.aspect;

import meng.springframework.annotation.Component;
import meng.springframework.annotation.aop.Around;
import meng.springframework.annotation.aop.Aspect;
import meng.springframework.aop.JoinPoint;

import javax.servlet.http.HttpServletRequest;

@Aspect
public class TestAspect {

//    @Around("com.springtest.controller.TestController")
    public void doAround(JoinPoint point) throws Exception{
        System.out.println("请求之前:"+point.getArgs());
        point.proceed();
        System.out.println("执行之后");
    }
}
