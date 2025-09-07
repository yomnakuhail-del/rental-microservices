package com.example.rental_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RentalServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RentalServiceApplication.class, args);
    }

    @Bean
    WebClient carWebClient(@Value("${car.base-url}") String baseUrl){
        return WebClient.builder().baseUrl(baseUrl).build();
    }
}
