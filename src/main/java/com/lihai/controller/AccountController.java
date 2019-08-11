package com.lihai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

@RestController
public class AccountController {
    //@Autowired
    //private RedisTemplate<String, Object> template; // fail
    //@Resource
    //private RedisTemplate<String, Object> template;

    @Autowired
    private RedisTemplate<String, String> template;

    @RequestMapping("pic")
    public void test(HttpServletResponse response) throws Exception {
        response.setHeader("Name", "Car.jpg");
        response.setHeader("Http-Status", "200");
        InputStream in = new FileInputStream("E:\\Amuse\\Wall\\car (2).jpg");
        byte[] buffer = new byte[1024 * 1024];
        int len = in.read(buffer);
        OutputStream out = response.getOutputStream();
        while(len > 0) {
            out.write(buffer, 0, len);
            len = in.read(buffer);
        }
    }
}