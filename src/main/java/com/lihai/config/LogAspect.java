package com.lihai.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 控制层日志切面
 */
@Component
@Aspect
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    // "com.lihai.controller包下所有public的任意返回类型"
    @Pointcut("execution(public * com.lihai.controller.*.*(..))")
    public void log() {}

    @Before("log()")
    public void doBefore() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        Map<String, String[]> paramPair = request.getParameterMap();
        Set<Map.Entry<String, String[]>> paramSet = paramPair.entrySet();
        Map<String, String> paramMap = new HashMap<>(paramSet.size());
        for(Map.Entry<String, String[]> item : paramSet) {
            paramMap.put(item.getKey(), item.getValue()[0]);
        }
        System.out.println();
    }

    @After("log()")
    public void doAfter() {

    }
}