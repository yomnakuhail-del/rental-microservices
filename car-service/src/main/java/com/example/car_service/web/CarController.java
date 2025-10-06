package com.example.car_service.web;

import com.example.car_service.model.CarAvailability;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {
  @GetMapping("/{id}/availability")
  public CarAvailability availability(@PathVariable String id){
boolean ok = !id.endsWith("5"); // ✅ جافا صحيحة
    return new CarAvailability(id, ok, ok ? "Gaza-Branch" : "N/A");
  }
}
