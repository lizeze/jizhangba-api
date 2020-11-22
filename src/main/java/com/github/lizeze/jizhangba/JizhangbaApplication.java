package com.github.lizeze.jizhangba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.lizeze.jizhangba.mapper")
public class JizhangbaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JizhangbaApplication.class, args);
    }

}
