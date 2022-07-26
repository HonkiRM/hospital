package com.wuniu.hospital_web.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置数据库连接池
 * 引入数据源配置文件
 */
@Configuration
public class DatasourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource(){

        return new DruidDataSource();
    }
}
