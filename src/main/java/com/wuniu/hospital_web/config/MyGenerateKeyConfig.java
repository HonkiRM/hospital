package com.wuniu.hospital_web.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * redis对缓存数据key的值
 */
@Configuration
public class MyGenerateKeyConfig {
    @Bean(value = "keyGenerator") //可以给bean取名字,不取默认就是方法名
    public KeyGenerator keyGenerator(){
        return new KeyGenerator() {
            //自定义缓存key的值
            @Override
            public Object generate(Object target, Method method, Object... params) {
                return target.getClass()+method.getName()+params.toString();
            }
        };
    }
}
