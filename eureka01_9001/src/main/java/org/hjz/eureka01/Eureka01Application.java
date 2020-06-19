package org.hjz.eureka01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //声明该项目是Eureka注册中心
public class Eureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka01Application.class, args);
    }

}
