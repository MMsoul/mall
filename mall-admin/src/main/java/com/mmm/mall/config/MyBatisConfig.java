package com.mmm.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by mmm on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.mmm.mall.mapper", "com.mmm.mall.dao"})
public class MyBatisConfig {
}
