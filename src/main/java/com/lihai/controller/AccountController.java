package com.lihai.controller;

import com.lihai.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.lang.instrument.Instrumentation;

@RestController
public class AccountController {
    private final Logger logger = LoggerFactory.getLogger(AccountController.class);
    @Autowired
    private AccountService accountService;
    //@Autowired
    //private RedisTemplate<String, Object> template; // fail
    //@Resource
    //private RedisTemplate<String, Object> template;
    @Autowired
    private RedisTemplate<String, String> template;








    /** ---------------------------------------------------------------------------------- */
    @RequestMapping("click")
    public String click(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        System.out.println("x-forwarded-for: " + ip);

        ip = request.getHeader("Proxy-Client-IP");
        System.out.println("Proxy-Client-IP: " + ip);

        ip = request.getHeader("X-Forwarded-For");
        System.out.println("X-Forwarded-For: " + ip);

        ip = request.getHeader("WL-Proxy-Client-IP");
        System.out.println("WL-Proxy-Client-IP: " + ip);

        ip = request.getHeader("HTTP_CLIENT_IP");
        System.out.println("HTTP_CLIENT_IP: " + ip);

        ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        System.out.println("HTTP_X_FORWARDED_FOR: " + ip);

        ip = request.getHeader("X-Real-IP");
        System.out.println("X-Real-IP: " + ip);

        //ip = request.getRemoteAddr();
        System.out.println("Remote: " + ip);

        System.out.println("Local: " + request.getLocalAddr());

        System.out.println("=====================================================");

        return ip;
    }
}