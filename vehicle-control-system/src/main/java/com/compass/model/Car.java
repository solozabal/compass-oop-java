package com.compass.model;

public class Car extends Vehicle {
    private boolean hasAirConditioning; // Indicates if the car has air conditioning
    private boolean hasRadio; // Indicates if the car has a radio

    // Constructor
    public Car(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
               int numberOfDoors, int numberOfWheels, boolean isCargo, 
               double cargoCapacity, Fuel fuel, boolean hasAirConditioning, boolean hasRadio) {
        super(hasEngine, hasSteeringWheel, passengerCapacity, numberOfDoors, 
              numberOfWheels, isCargo, cargoCapacity, fuel);
        this.hasAirConditioning = hasAirConditioning;
        this.hasRadio = hasRadio;
    }

    // Getters and Setters
    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    public void setAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean hasRadio() {
        return hasRadio;
    }

    public void setRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }
}
