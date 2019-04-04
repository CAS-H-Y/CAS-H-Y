package com.heyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * creat on 2019/4/4
 * <p>
 * #author : CAS_hy
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigServer
public class ConfigAplication {
        public static void main(String[] args) {
            SpringApplication.run(ConfigAplication.class, args);
        }
}
