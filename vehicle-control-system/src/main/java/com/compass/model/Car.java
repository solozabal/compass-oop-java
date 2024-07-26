package com.compass.model;

import com.compass.exception.InvalidVehicleException;

public class Car extends Vehicle {
    private boolean hasAirConditioning; // Indicates if the car has air conditioning
    private boolean hasRadio; // Indicates if the car has a radio

    // Constructor
    public Car(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
               int numberOfDoors, int numberOfWheels, boolean isCargo, 
               double cargoCapacity, Fuel fuel, boolean hasAirConditioning, boolean hasRadio) 
               throws InvalidVehicleException {
        super(hasEngine, hasSteeringWheel, passengerCapacity, numberOfDoors, 
              numberOfWheels, isCargo, cargoCapacity, fuel);
        
        // Validate passenger capacity
        if (passengerCapacity < 0) {
            throw new InvalidVehicleException("Passenger capacity cannot be negative.");
        }

        this.hasAirConditioning = hasAirConditioning;
        this.hasRadio = hasRadio;
    }

    // Maintenance implementation
    @Override
    public void performMaintenance() {
        super.performMaintenance(); // Call the parent method
        System.out.println("Performing car-specific maintenance...");
        // Additional car-specific maintenance checks can be added here
        if (hasAirConditioning) {
            System.out.println("Checking air conditioning system...");
        }
        if (hasRadio) {
            System.out.println("Checking radio functionality...");
        }
        System.out.println("Car maintenance completed successfully.");
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
