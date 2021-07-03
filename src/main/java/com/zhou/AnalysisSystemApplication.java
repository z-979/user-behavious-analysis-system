package com.zhou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zhou.mapper")
public class AnalysisSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnalysisSystemApplication.class, args);
    }

}
