package org.hjz.zuul_9008;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //加上网关注解
public class Zuul9008Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul9008Application.class, args);
    }

}
