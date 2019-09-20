package com.lihai.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 控制层日志切面
 */
@Component
@Aspect
public class LogAspect {
    private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    // "com.lihai.controller包下所有public的任意返回类型"
    //@Pointcut("execution(public * com.lihai.controller.*.*(..))")
    //public void log() {}

    @Before("execution(public * com.lihai.controller.*.*(..))")
    public void doBefore(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("在" + methodName + "之前执行");
    }

    //@AfterReturning("log()")
    @AfterReturning(returning = "obj", value = "execution(public * com.lihai.controller.*.*(..))")
    public void doAfter(Object obj) {
        System.out.println("====================");
    }
}