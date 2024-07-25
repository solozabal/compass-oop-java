package com.compass.model;

public class Motorcycle extends Vehicle {
    private boolean hasElectricStart; // Indicates if the motorcycle has an electric start

    // Constructor
    public Motorcycle(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
                      int numberOfDoors, int numberOfWheels, boolean isCargo, 
                      double cargoCapacity, Fuel fuel, boolean hasElectricStart) {
        super(hasEngine, hasSteeringWheel, passengerCapacity, numberOfDoors, 
              numberOfWheels, isCargo, cargoCapacity, fuel);
        this.hasElectricStart = hasElectricStart;
    }

    // Getters and Setters
    public boolean hasElectricStart() {
        return hasElectricStart;
    }

    public void setElectricStart(boolean hasElectricStart) {
        this.hasElectricStart = hasElectricStart;
    }
}
