package com.ac.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 现在在eureka-client可以不用输入注释@EnableEurekaClient就可以开启eureka的客户端支持！！！<br>
 * 以下是spring cloud官方提供的说明:<br>
 * 请注意：只要在classpath中引用了spring-cloud-starter-netflix-eureka-client的GAV就可以开始eureka的支持了!<br>
 * Note that the preceding example shows a normal [Spring Boot](https://projects.spring.io/spring-boot/) application.<br>
 * By having `spring-cloud-starter-netflix-eureka-client` on the classpath, your application automatically registers with the Eureka Server.<br>
 * 来自：https://cloud.spring.io/spring-cloud-static/Greenwich.SR2/single/spring-cloud.html#_service_discovery_eureka_clients<br>
 *
 * @author Echo
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
