package com.lihai.controller;

import com.lihai.entity.Account;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {
    //@Autowired
    //private RedisTemplate<String, Object> template; // fail
    //@Autowired
    //private RedisTemplate<String, String> template; // ok
    //@Resource
    //private RedisTemplate<String, Object> template;

    private static Date date;
    static {
        date = new Date();
    }
    @GetMapping("login")
    public String login() {
        System.out.println(date);
        return "login";
    }
}