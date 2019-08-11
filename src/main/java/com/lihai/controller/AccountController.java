package com.lihai.controller;

import com.lihai.entity.Account;
import com.lihai.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    //@Autowired
    //private RedisTemplate<String, Object> template; // fail
    //@Resource
    //private RedisTemplate<String, Object> template;
    @Autowired
    private RedisTemplate<String, String> template;

    @GetMapping("user/{phone}")
    public String findUserByPhone(@PathVariable String phone){
        Account account = accountService.findUserByPhone(phone);
        System.out.println(account);
        return "ok";
    }
}