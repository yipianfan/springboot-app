package com.lihai.config;

import com.lihai.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student student() {
        System.out.println("StudentConfig.student() called.");
        return new Student();
    }
}