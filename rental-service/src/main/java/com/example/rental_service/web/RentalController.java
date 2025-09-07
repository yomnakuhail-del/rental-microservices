package com.example.rental_service.web;

import com.example.rental_service.client.CarClient;
import com.example.rental_service.model.CarAvailability;
import com.example.rental_service.model.RentalRequest;
import com.example.rental_service.model.RentalResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    private final CarClient carClient;

    public RentalController(CarClient carClient) {
        this.carClient = carClient;
    }

    @PostMapping
    public ResponseEntity<RentalResponse> create(@RequestBody RentalRequest req){
        CarAvailability av = carClient.checkAvailability(req.getCarId());

        if (av != null && av.isAvailable()){
            return ResponseEntity.ok(
                new RentalResponse("CONFIRMED", req.getCarId(), req.getCustomerId(), av.getLocation())
            );
        } else {
            return ResponseEntity.ok(
                new RentalResponse("REJECTED", req.getCarId(), req.getCustomerId(), null)
            );
        }
    }
}
