package com.lanyu.lanyu96;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.lanyu.lanyu96.mapper")
@SpringBootApplication
public class Lanyu96Application {

    public static void main(String[] args) {
        SpringApplication.run(Lanyu96Application.class, args);
    }

}
