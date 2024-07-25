package com.compass.model;

public class Carriage extends Vehicle {
    // Constructor
    public Carriage(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
                    int numberOfDoors, int numberOfWheels, boolean isCargo, 
                    double cargoCapacity, Fuel fuel) {
        super(hasEngine, hasSteeringWheel, passengerCapacity, numberOfDoors, 
              numberOfWheels, isCargo, cargoCapacity, fuel);
    }

    // Additional methods specific to Carriage can be added here
}
