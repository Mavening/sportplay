package com.lhl;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lhl.dao")
public class Sportplay2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sportplay2Application.class, args);
    }

}
