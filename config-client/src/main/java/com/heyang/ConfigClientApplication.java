package com.heyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * creat on 2019/4/4
 * <p>
 * #author : CAS_hy
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
