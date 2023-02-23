package com.example.mall.mymall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.example.mall.mymall.mbg.mapper","com.example.mall.mymall.dao"})
public class MyBatisConfig {
}
