package com.compass.controller;

import com.compass.model.Vehicle;
import com.compass.exception.InvalidVehicleException;
import com.compass.exception.VehicleNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class VehicleController {
    private final List<Vehicle> vehicles; // List to store vehicles

    // Constructor
    public VehicleController() {
        vehicles = new ArrayList<>(); // Initialize the vehicle list
    }

    // Method to add a vehicle
    public void addVehicle(Vehicle vehicle) throws InvalidVehicleException {
        if (vehicle.getPassengerCapacity() < 0) {
            throw new InvalidVehicleException("Passenger capacity cannot be negative.");
        }
        vehicles.add(vehicle);
    }

    // Method to find a vehicle by its index
    public Vehicle getVehicle(int index) throws VehicleNotFoundException {
        if (index >= 0 && index < vehicles.size()) {
            return vehicles.get(index);
        }
        throw new VehicleNotFoundException("Vehicle not found at index: " + index);
    }
}
