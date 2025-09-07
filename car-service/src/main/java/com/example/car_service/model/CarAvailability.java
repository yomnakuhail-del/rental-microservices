package com.example.car_service.model;

public class CarAvailability {
  private String carId;
  private boolean available;
  private String location;

  public CarAvailability() {}
  public CarAvailability(String carId, boolean available, String location) {
    this.carId = carId; this.available = available; this.location = location;
  }
  public String getCarId(){ return carId; }
  public boolean isAvailable(){ return available; }
  public String getLocation(){ return location; }
  public void setCarId(String v){ this.carId = v; }
  public void setAvailable(boolean v){ this.available = v; }
  public void setLocation(String v){ this.location = v; }
}
