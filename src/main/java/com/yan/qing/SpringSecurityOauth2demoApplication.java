package com.yan.qing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityOauth2demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityOauth2demoApplication.class, args);
    }

}
