package com.compass.dto;

import com.compass.model.Fuel;

public final class VehicleDTO { // Tornando a classe final
    private boolean hasEngine; // Indicates if the vehicle has an engine
    private boolean hasSteeringWheel; // Indicates if the vehicle has a steering wheel
    private int passengerCapacity; // Number of passengers
    private int numberOfDoors; // Number of doors
    private int numberOfWheels; // Number of wheels
    private boolean isCargo; // Indicates if it is a cargo vehicle
    private double cargoCapacity; // Cargo capacity in KG
    private Fuel fuel; // Type of fuel

    // Constructor
    public VehicleDTO(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
                      int numberOfDoors, int numberOfWheels, boolean isCargo, 
                      double cargoCapacity, Fuel fuel) {
        this.hasEngine = hasEngine;
        this.hasSteeringWheel = hasSteeringWheel;
        setPassengerCapacity(passengerCapacity); // Use setter for validation
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        this.isCargo = isCargo;
        setCargoCapacity(cargoCapacity); // Use setter for validation
        this.fuel = fuel;
    }

    // Getters and Setters
    public boolean hasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public boolean hasSteeringWheel() {
        return hasSteeringWheel;
    }

    public void setHasSteeringWheel(boolean hasSteeringWheel) {
        this.hasSteeringWheel = hasSteeringWheel;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    // Making the setter private to avoid overridable method call in constructor
    private void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity < 0) {
            throw new IllegalArgumentException("Passenger capacity cannot be negative.");
        }
        this.passengerCapacity = passengerCapacity;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isCargo() {
        return isCargo;
    }

    public void setIsCargo(boolean isCargo) {
        this.isCargo = isCargo;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    // Making the setter private to avoid overridable method call in constructor
    private void setCargoCapacity(double cargoCapacity) {
        if (cargoCapacity < 0) {
            throw new IllegalArgumentException("Cargo capacity cannot be negative.");
        }
        this.cargoCapacity = cargoCapacity;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
}