package com.cetiti;

import com.cetiti.service.AnotherServieceImpl;
import com.cetiti.service.CommonService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zsh7040 on 2017-8-21.
 */
@EnableAutoConfiguration
@MapperScan("com.cetiti.mapper")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
