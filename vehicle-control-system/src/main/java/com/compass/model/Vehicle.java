package com.compass.model;

import com.compass.exception.CargoCapacityException;

public class Vehicle {
    private final boolean hasEngine; // Indicates if the vehicle has an engine
    private final boolean hasSteeringWheel; // Indicates if the vehicle has a steering wheel
    private final int passengerCapacity; // Number of passengers
    private final int numberOfDoors; // Number of doors
    private final int numberOfWheels; // Number of wheels
    private final boolean isCargo; // Indicates if it is a cargo vehicle
    private final double cargoCapacity; // Cargo capacity in KG
    private Fuel fuel; // Type of fuel
    private double currentCargo; // Current cargo weight

    // Constructor
    public Vehicle(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity,
                   int numberOfDoors, int numberOfWheels, boolean isCargo,
                   double cargoCapacity, Fuel fuel) {
        this.hasEngine = hasEngine;
        this.hasSteeringWheel = hasSteeringWheel;
        this.passengerCapacity = passengerCapacity;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        this.isCargo = isCargo;
        this.cargoCapacity = cargoCapacity;
        this.fuel = fuel;
        this.currentCargo = 0; // Initialize current cargo to 0
    }

    // Method to load cargo
    public void loadCargo(double weight) throws CargoCapacityException {
        if (!isCargo) {
            throw new CargoCapacityException("This vehicle is not designed for cargo.");
        }
        if (currentCargo + weight > cargoCapacity) {
            throw new CargoCapacityException("Cargo exceeds the vehicle's capacity.");
        }
        currentCargo += weight; // Update the current cargo weight
        System.out.println("Loaded " + weight + " KG of cargo. Current cargo: " + currentCargo + " KG.");
    }

    // Method to unload cargo
    public void unloadCargo(double weight) throws CargoCapacityException {
        if (currentCargo - weight < 0) {
            throw new CargoCapacityException("Cannot unload more cargo than currently loaded.");
        }
        currentCargo -= weight; // Update the current cargo weight
        System.out.println("Unloaded " + weight + " KG of cargo. Current cargo: " + currentCargo + " KG.");
    }

    // Getters
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getCurrentCargo() {
        return currentCargo;
    }

    public boolean hasEngine() {
        return hasEngine;
    }

    public boolean hasSteeringWheel() {
        return hasSteeringWheel;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public boolean isCargo() {
        return isCargo;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
}
