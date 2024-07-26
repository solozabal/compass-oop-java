package com.compass.model;

import com.compass.exception.InvalidVehicleException;

public class Motorcycle extends Vehicle {
    private boolean hasElectricStart; // Indicates if the motorcycle has an electric start

    // Constructor
    public Motorcycle(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
                      int numberOfDoors, int numberOfWheels, boolean isCargo, 
                      double cargoCapacity, Fuel fuel, boolean hasElectricStart) 
                      throws InvalidVehicleException {
        super(hasEngine, hasSteeringWheel, passengerCapacity, numberOfDoors, 
              numberOfWheels, isCargo, cargoCapacity, fuel);
        
        // Validate passenger capacity
        if (passengerCapacity < 0) {
            throw new InvalidVehicleException("Passenger capacity cannot be negative.");
        }

        this.hasElectricStart = hasElectricStart;
    }

    // Maintenance implementation
    @Override
    public void performMaintenance() {
        super.performMaintenance(); // Call the parent method
        System.out.println("Performing motorcycle-specific maintenance...");
        // Additional motorcycle-specific maintenance checks can be added here
        if (hasElectricStart) {
            System.out.println("Checking electric start functionality...");
        }
        System.out.println("Motorcycle maintenance completed successfully.");
    }

    // Getters and Setters
    public boolean hasElectricStart() {
        return hasElectricStart;
    }

    public void setElectricStart(boolean hasElectricStart) {
        this.hasElectricStart = hasElectricStart;
    }
}
