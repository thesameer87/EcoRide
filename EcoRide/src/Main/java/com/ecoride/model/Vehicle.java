package com.ecoride.model;

public class Vehicle {
    private int vehicleId;
    private int ownerId; // User ID of the vehicle owner
    private String model;
    private int ecoRating; // Rating of the vehicle's eco-friendliness

    public Vehicle(int vehicleId, int ownerId, String model, int ecoRating) {
        this.vehicleId = vehicleId;
        this.ownerId = ownerId;
        this.model = model;
        this.ecoRating = ecoRating;
    }

    // Getters and Setters
    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getEcoRating() { return ecoRating; }
    public void setEcoRating(int ecoRating) { this.ecoRating = ecoRating; }

    @Override
    public String toString() {
        return "Vehicle{id=" + vehicleId + ", model='" + model + "', ecoRating=" + ecoRating + "}";
    }
}
