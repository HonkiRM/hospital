package com.wuniu.hospital_web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(value = "com.wuniu.hospital_web.mapper")
@EnableSwagger2
@EnableTransactionManagement  //配置声明式事务
@EnableCaching  //启动缓存
public class HospitalApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(HospitalApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
