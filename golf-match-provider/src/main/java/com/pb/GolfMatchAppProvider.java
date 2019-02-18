package com.pb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.pb.repository")
public class GolfMatchAppProvider{
    public static void main( String[] args ){
        SpringApplication.run(GolfMatchAppProvider.class,args);
    }
}
