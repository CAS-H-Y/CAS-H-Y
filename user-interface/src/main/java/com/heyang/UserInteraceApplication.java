package com.heyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * creat on 2019/4/3
 * <p>
 * #author : CAS_hy
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableCaching
@EnableFeignClients(basePackages = { "com.heyang.client" })
@EnableHystrix
public class UserInteraceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserInteraceApplication.class, args);
    }

}
