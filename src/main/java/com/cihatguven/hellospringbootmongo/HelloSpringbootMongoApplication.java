package com.cihatguven.hellospringbootmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class HelloSpringbootMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringbootMongoApplication.class, args);
    }

}
