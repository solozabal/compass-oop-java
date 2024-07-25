package com.compass.model;

public class Truck extends Vehicle {
    private int numberOfAxles; // Number of axles on the truck

    // Constructor
    public Truck(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
                 int numberOfDoors, int numberOfWheels, boolean isCargo, 
                 double cargoCapacity, Fuel fuel, int numberOfAxles) {
        super(hasEngine, hasSteeringWheel, passengerCapacity, numberOfDoors, 
              numberOfWheels, isCargo, cargoCapacity, fuel);
        this.numberOfAxles = numberOfAxles;
    }

    // Getters and Setters
    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }
}
