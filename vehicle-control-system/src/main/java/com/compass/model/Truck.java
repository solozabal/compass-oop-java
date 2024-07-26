package com.compass.model;

import com.compass.exception.InvalidVehicleException;

public class Truck extends Vehicle {
    private int numberOfAxles; // Number of axles on the truck

    // Constructor
    public Truck(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
                 int numberOfDoors, int numberOfWheels, boolean isCargo, 
                 double cargoCapacity, Fuel fuel, int numberOfAxles) 
                 throws InvalidVehicleException {
        super(hasEngine, hasSteeringWheel, passengerCapacity, numberOfDoors, 
              numberOfWheels, isCargo, cargoCapacity, fuel);
        
        // Validate passenger capacity
        if (passengerCapacity < 0) {
            throw new InvalidVehicleException("Passenger capacity cannot be negative.");
        }

        this.numberOfAxles = numberOfAxles;
    }

    // Maintenance implementation
    @Override
    public void performMaintenance() {
        super.performMaintenance(); // Call the parent method
        System.out.println("Performing truck-specific maintenance...");
        // Additional truck-specific maintenance checks can be added here
        System.out.println("Checking number of axles: " + numberOfAxles);
        System.out.println("Truck maintenance completed successfully.");
    }

    // Getters and Setters
    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }
}
