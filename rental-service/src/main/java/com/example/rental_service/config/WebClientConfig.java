package com.example.rental_service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${car.service.url}")
    private String baseUrl; // مثال: http://localhost:8081

    @Bean
    public WebClient carWebClient() {
        return WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }
}
