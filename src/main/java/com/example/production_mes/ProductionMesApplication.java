package com.example.production_mes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.production_mes.mapper")
public class ProductionMesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductionMesApplication.class, args);
    }

}
