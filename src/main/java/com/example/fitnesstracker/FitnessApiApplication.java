package com.example.fitnesstracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;

@SpringBootApplication(exclude = {R2dbcAutoConfiguration.class})
public class FitnessApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FitnessApiApplication.class, args);
    }
}
