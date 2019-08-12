package com.lihai.controller;

import com.lihai.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

@RestController
public class AccountController extends BaseController {
    @Autowired
    private RedisTemplate<String, String> template;
    //@Autowired
    //private RedisTemplate<String, Object> template; // fail
    //@Resource
    //private RedisTemplate<String, Object> template;

    Map<String, String> userMap = new HashMap<>();
    {
        userMap.put("Hunt", "123456");
        userMap.put("Green", "abcdef");
        userMap.put("Bill", "Seattle");
    }

    @RequestMapping("login")
    public String login(HttpServletResponse response) {
        response.setStatus(401);
        return "账号或密码错误";
    }


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