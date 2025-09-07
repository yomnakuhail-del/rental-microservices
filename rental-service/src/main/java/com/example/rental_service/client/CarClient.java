package com.example.rental_service.client;

import com.example.rental_service.model.CarAvailability;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class CarClient {

    private final WebClient webClient;

    // نحقن WebClient المُعرّف كـ Bean
    public CarClient(WebClient carWebClient) {
        this.webClient = carWebClient;
    }

    public CarAvailability checkAvailability(String id) {
        return webClient.get()
                .uri("/cars/{id}/availability", id)
                .retrieve()
                .bodyToMono(CarAvailability.class)
                .block();
    }
}
