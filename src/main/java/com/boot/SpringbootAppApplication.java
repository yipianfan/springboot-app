package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.boot.controller", "config"})
public class SpringbootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAppApplication.class, args);
    }

}
