package com.compass.controller;

import com.compass.model.Vehicle;
import com.compass.exception.InvalidVehicleException;
import com.compass.exception.VehicleNotFoundException;

import java.util.ArrayList;
import java.util.List;

import com.compass.exception.CargoCapacityException;
import com.compass.model.Carriage;

public class VehicleController {
    private final List<Vehicle> vehicles; // List to store vehicles

    // Constructor
    public VehicleController() {
        vehicles = new ArrayList<>(); // Initialize the vehicle list
    }

    // Method to add a vehicle
    public void addVehicle(Vehicle vehicle) throws InvalidVehicleException {
        // Validate passenger capacity
        if (vehicle.getPassengerCapacity() < 0) {
            throw new InvalidVehicleException("Passenger capacity cannot be negative.");
        }
        vehicles.add(vehicle); // Add the vehicle to the list
    }

    // Method to edit a vehicle
    public void editVehicle(int index, Vehicle updatedVehicle) throws VehicleNotFoundException, InvalidVehicleException {
        if (index >= 0 && index < vehicles.size()) {
            // Validate the updated vehicle
            if (updatedVehicle.getPassengerCapacity() < 0) {
                throw new InvalidVehicleException("Passenger capacity cannot be negative.");
            }
            vehicles.set(index, updatedVehicle); // Update the vehicle at the specified index
        } else {
            throw new VehicleNotFoundException("Vehicle not found at index: " + index);
        }
    }

    // Method to remove a vehicle
    public void removeVehicle(int index) throws VehicleNotFoundException {
        if (index >= 0 && index < vehicles.size()) {
            vehicles.remove(index); // Remove the vehicle at the specified index
        } else {
            throw new VehicleNotFoundException("Vehicle not found at index: " + index);
        }
    }

    // Method to find a vehicle by its index
    public Vehicle getVehicle(int index) throws VehicleNotFoundException {
        if (index >= 0 && index < vehicles.size()) {
            return vehicles.get(index); // Return the vehicle at the specified index
        }
        throw new VehicleNotFoundException("Vehicle not found at index: " + index);
    }

    // Method to perform maintenance on a vehicle
    public void performMaintenance(int index) {
        try {
            Vehicle vehicle = getVehicle(index); // Get the vehicle
            vehicle.performMaintenance(); // Call the maintenance method on the vehicle
        } catch (VehicleNotFoundException e) {
            System.out.println("Error performing maintenance: " + e.getMessage());
        }
    }

    // Method to get all vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicles; // Return the list of vehicles
    }

    // Method to load cargo for a specific vehicle
    public void loadCargo(int index, double weight) {
        try {
            Vehicle vehicle = getVehicle(index);
            if (vehicle instanceof Carriage carriage) {
                carriage.loadCargo(weight);
            } else {
                System.out.println("This vehicle cannot carry cargo.");
            }
        } catch (VehicleNotFoundException | CargoCapacityException e) {
            System.out.println("Error loading cargo: " + e.getMessage());
        }
    }

    // Method to unload cargo for a specific vehicle
    public void unloadCargo(int index, double weight) {
        try {
            Vehicle vehicle = getVehicle(index);
            if (vehicle instanceof Carriage carriage) {
                carriage.unloadCargo(weight);
            } else {
                System.out.println("This vehicle cannot carry cargo.");
            }
        } catch (VehicleNotFoundException | CargoCapacityException e) {
            System.out.println("Error unloading cargo: " + e.getMessage());
        }
    }
}
