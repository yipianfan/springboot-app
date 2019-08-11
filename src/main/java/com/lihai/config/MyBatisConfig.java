package com.lihai.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages={"com.lihai.dao"})
public class MyBatisConfig {}