# 基于Eureka注册中心的SpringCloud项目

## 搭建Eureka注册中心（Eureka集群）

步骤：

1. 在maven父工程中创建两个子模块（eureka01、eureka02）

2. 导入maven依赖

   ```xml
   <properties>
           <java.version>1.8</java.version>
           <spring-cloud.version>Hoxton.SR4</spring-cloud.version>
       </properties>
   
       <dependencies>
           <dependency>
               <groupId>org.springframework.cloud</groupId>
               <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
           </dependency>
   
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-test</artifactId>
               <scope>test</scope>
               <exclusions>
                   <exclusion>
                       <groupId>org.junit.vintage</groupId>
                       <artifactId>junit-vintage-engine</artifactId>
                   </exclusion>
               </exclusions>
           </dependency>
       </dependencies>
   ```

3. 编写配置文件（以下是eureka01的配置，eureka02只需要将hostname改成eureka02，defaultZone改成http://eureka01:9001/erueka/即可）

   ```yml
   server:
     port: 9001
   eureka:
     instance:
       hostname: eureka01  #Eureka服务端的实例名字
     client:
       register-with-eureka: false #表示是否向 Eureka 注册中心注册自己(这个模块 本身是服务器,所以不需要)
       fetch-registry: false #fetch-registry如果为false,则表示自己为注册中心
       service-url:
         defaultZone: http://eureka02:9002/eureka/ #对外提供的注册入口，关联eureka02
   ```

4. 在SpringBoot启动类开启Eureka注册中心

   ```java
   @SpringBootApplication
   @EnableEurekaServer //声明该项目是Eureka注册中心
   public class Eureka01Application {
   
       public static void main(String[] args) {
           SpringApplication.run(Eureka01Application.class, args);
       }
   
   }
   ```

   

## 搭建注册服务实例

步骤：

1. 在maven父工程下创建两个注册服务模块（创建两个主要为了测试负载均衡）

2. 导入maven依赖

   ```xml
   <properties>
           <java.version>1.8</java.version>
           <spring-cloud.version>Hoxton.SR4</spring-cloud.version>
       </properties>
   
       <dependencies>
           <dependency>
               <groupId>org.springframework.cloud</groupId>
               <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
           </dependency>
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-web</artifactId>
           </dependency>
           <dependency>
               <groupId>org.projectlombok</groupId>
               <artifactId>lombok</artifactId>
               <version>1.18.12</version>
           </dependency>
           <dependency>
               <groupId>org.postgresql</groupId>
               <artifactId>postgresql</artifactId>
               <version>42.2.5</version>
           </dependency>
           <dependency>
               <groupId>org.mybatis.spring.boot</groupId>
               <artifactId>mybatis-spring-boot-starter</artifactId>
               <version>2.1.1</version>
           </dependency>
           <!--导入Hystrix依赖-->
           <dependency>
               <groupId>org.springframework.cloud</groupId>
               <artifactId>spring-cloud-starter-hystrix</artifactId>
               <version>1.4.6.RELEASE</version>
           </dependency>
           <!--让这个服务能够被监控-->
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-actuator</artifactId>
           </dependency>
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-test</artifactId>
               <scope>test</scope>
               <exclusions>
                   <exclusion>
                       <groupId>org.junit.vintage</groupId>
                       <artifactId>junit-vintage-engine</artifactId>
                   </exclusion>
               </exclusions>
           </dependency>
       </dependencies>
   ```

3. 编写配置文件（以下是invoked01的注册服务实例，involved02配置一样）

   ```yml
   server:
     port: 9003
   spring:
     application:
       name: invoked #SpringCloud注册中心是通过应用实例名识别服务
     datasource: #postgreSql连接配置
       url: jdbc:postgresql://localhost:5432/honor?currentSchema=pressfree
       username: postgres
       password: xxxxx
       type: com.zaxxer.hikari.HikariDataSource
       driver-class-name: org.postgresql.Driver
       hikari:
         pool-name: Invoked #连接池名称
         minimum-idle: 3 #最小空闲时间，默认值为10
         maximum-pool-size: 12 #最大连接数
         connection-timeout: 30000 #最小空闲连接
         idle-timeout: 600000  #空闲连接超时时间
         max-lifetime: 1200000 #连接最大存活时间
   eureka:
     client:
       service-url:
         defaultZone: http://eureka01:9001/eureka/,http://eureka02:9002/eureka/ #注册到eureka注册中心
   #mybatis配置
   mybatis:
     mapper-locations: classpath:org\\hjz\\invoked01\\common\\mapper\\**.xml
     type-aliases-package: org.hjz.invoked01.common.model
   ```

4. 在SpringBoot启动类开启注册服务实例

```java
package org.hjz.invoked01;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient //客户端的启动类，在服务启动后自动向注册中心 注册服务
@MapperScan("org.hjz.invoked01.common.dao")
public class Invoked01Application {

    public static void main(String[] args) {
        SpringApplication.run(Invoked01Application.class, args);
    }
}
```



## 搭建发现服务实例

步骤：

1. 在maven父工程下创建两个发现服务模块

2. 导入maven依赖

   ```xml
   <properties>
           <java.version>1.8</java.version>
           <spring-cloud.version>Hoxton.SR4</spring-cloud.version>
       </properties>
   
       <dependencies>
           <dependency>
               <groupId>org.springframework.cloud</groupId>
               <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
           </dependency>
           <dependency>
               <groupId>org.springframework.cloud</groupId>
               <artifactId>spring-cloud-starter-ribbon</artifactId>
               <version>1.4.7.RELEASE</version>
           </dependency>
           <dependency>
               <groupId>org.projectlombok</groupId>
               <artifactId>lombok</artifactId>
               <version>1.18.12</version>
           </dependency>
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-web</artifactId>
           </dependency>
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-test</artifactId>
               <scope>test</scope>
               <exclusions>
                   <exclusion>
                       <groupId>org.junit.vintage</groupId>
                       <artifactId>junit-vintage-engine</artifactId>
                   </exclusion>
               </exclusions>
           </dependency>
       </dependencies>
   
       <dependencyManagement>
           <dependencies>
               <dependency>
                   <groupId>org.springframework.cloud</groupId>
                   <artifactId>spring-cloud-dependencies</artifactId>
                   <version>${spring-cloud.version}</version>
                   <type>pom</type>
                   <scope>import</scope>
               </dependency>
           </dependencies>
       </dependencyManagement>
   ```

3. 编写配置文件

   ```yml
   server:
     port: 9005
   spring:
     application:
       name: discovery01 #SpringCloud是通过实例名发现服务的
   eureka:
     client:
       service-url:
         defaultZone: http://eureka01:9001/eureka/,http://eureka02:9002/eureka/ #注册到eureka注册中心
   ```

4. 在SpringBoot启动类中开启发现服务实例

   ```java
   package org.hjz.discovery;
   
   import org.springframework.boot.SpringApplication;
   import org.springframework.boot.autoconfigure.SpringBootApplication;
   import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
   import org.springframework.cloud.client.loadbalancer.LoadBalanced;
   import org.springframework.context.annotation.Bean;
   import org.springframework.web.client.RestTemplate;
   
   @SpringBootApplication
   @EnableDiscoveryClient
   public class DiscoveryApplication {
   
       public static void main(String[] args) {
           SpringApplication.run(DiscoveryApplication.class, args);
       }
   }
   ```

   