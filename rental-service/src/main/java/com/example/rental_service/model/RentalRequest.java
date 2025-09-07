package com.example.rental_service.model;

public class RentalRequest {
  private String carId;
  private String customerId;

  public String getCarId(){ return carId; }
  public void setCarId(String v){ this.carId = v; }
  public String getCustomerId(){ return customerId; }
  public void setCustomerId(String v){ this.customerId = v; }
}
