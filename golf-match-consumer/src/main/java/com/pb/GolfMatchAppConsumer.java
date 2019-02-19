package com.pb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pb.repository")
public class GolfMatchAppConsumer {
    public static void main(String[] args) {
        SpringApplication.run(GolfMatchAppConsumer.class,args);
    }
}
