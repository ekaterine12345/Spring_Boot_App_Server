package com.example.spring_boot_app_server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAppServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppServerApplication.class, args);
    }

} // aq ikos login paneli
