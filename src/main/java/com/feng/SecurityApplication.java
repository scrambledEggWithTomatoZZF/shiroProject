package com.feng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Administrator
 * @Date: 2021/2/1 22:45
 * @Description:
 */
@SpringBootApplication
//使用MapperScan批量扫描所有的Mapper接口；
@MapperScan("com.feng.mapper")
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class);
    }
}
