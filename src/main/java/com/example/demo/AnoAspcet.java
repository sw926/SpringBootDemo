package com.example.demo;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnoAspcet {

    @Before("execution(public * com.example.demo.*.*(*))")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("do in Aspect before method called! args: " + JSON.toJSONString(joinPoint.getArgs()));
    }
}