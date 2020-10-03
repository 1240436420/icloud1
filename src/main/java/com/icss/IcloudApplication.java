package com.icss;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.icss.mapper")
public class IcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcloudApplication.class, args);
    }

}
