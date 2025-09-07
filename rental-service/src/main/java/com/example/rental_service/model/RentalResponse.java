package com.example.rental_service.model;

public class RentalResponse {
    private String status;
    private String carId;
    private String customerId;
    private String location;

    public RentalResponse() {}

    public RentalResponse(String status, String carId, String customerId, String location) {
        this.status = status;
        this.carId = carId;
        this.customerId = customerId;
        this.location = location;
    }

    public String getStatus() { return status; }
    public void setStatus(String v) { this.status = v; }

    public String getCarId() { return carId; }
    public void setCarId(String v) { this.carId = v; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String v) { this.customerId = v; }

    public String getLocation() { return location; }
    public void setLocation(String v) { this.location = v; }
}
