package org.hjz.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启Dashboard
public class HystrixdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixdashboardApplication.class, args);
    }

}
