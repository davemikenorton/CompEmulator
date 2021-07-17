package com.cerelus.compemulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CompEmulatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompEmulatorApplication.class, args);
    }
}
