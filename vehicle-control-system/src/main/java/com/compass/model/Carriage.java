package com.compass.model;

import com.compass.exception.CargoCapacityException;
import com.compass.exception.InvalidVehicleException;

public class Carriage extends Vehicle {
    private double currentCargo; // Current cargo weight

    // Constructor
    public Carriage(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
                    int numberOfDoors, int numberOfWheels, boolean isCargo, 
                    double cargoCapacity, Fuel fuel) throws InvalidVehicleException {
        super(hasEngine, hasSteeringWheel, passengerCapacity, numberOfDoors, 
              numberOfWheels, isCargo, cargoCapacity, fuel);
        
        // Validate passenger capacity
        if (passengerCapacity < 0) {
            throw new InvalidVehicleException("Passenger capacity cannot be negative.");
        }

        this.currentCargo = 0; // Initialize current cargo to 0
    }

    // Method to load cargo
    @Override
    public void loadCargo(double weight) throws CargoCapacityException {
        if (!getIsCargo()) {
            throw new CargoCapacityException("This carriage is not designed for cargo.");
        }
        if (currentCargo + weight > getCargoCapacity()) {
            throw new CargoCapacityException("Cargo exceeds the carriage's capacity.");
        }
        currentCargo += weight;
        System.out.println("Loaded " + weight + " KG of cargo. Current cargo: " + currentCargo + " KG.");
    }

    // Method to unload cargo
    @Override
    public void unloadCargo(double weight) throws CargoCapacityException {
        if (currentCargo - weight < 0) {
            throw new CargoCapacityException("Cannot unload more cargo than currently loaded.");
        }
        currentCargo -= weight;
        System.out.println("Unloaded " + weight + " KG of cargo. Current cargo: " + currentCargo + " KG.");
    }

    // Method to check if the carriage is overloaded
    public boolean isOverloaded() {
        return currentCargo > getCargoCapacity();
    }

    // Method to get the current cargo
    @Override
    public double getCurrentCargo() {
        return currentCargo;
    }

    // Method to set the passenger capacity
    public void setPassengerCapacity(int capacity) throws InvalidVehicleException {
        if (capacity < 0) {
            throw new InvalidVehicleException("Passenger capacity cannot be negative.");
        }
    }

    // Method to display carriage information
    public void displayInfo() {
        System.out.println("Carriage Info:");
        System.out.println("Passenger Capacity: " + getPassengerCapacity());
        System.out.println("Cargo Capacity: " + getCargoCapacity());
        System.out.println("Current Cargo: " + currentCargo);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
    }

    // Method to start the carriage's journey
    public void startJourney() {
        System.out.println("The carriage is starting its journey.");
    }

    private boolean getIsCargo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}