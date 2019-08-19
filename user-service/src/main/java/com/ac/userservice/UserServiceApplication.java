package com.ac.userservice;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig
@RestController
public class UserServiceApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello SAPer, I am from user-service";
    }

    @RequestMapping("/index")
    public String index() {
        return "Hello SAPer, I am from user-service";
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
