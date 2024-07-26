package com.compass.service;

import com.compass.controller.VehicleController;
import com.compass.exception.InvalidVehicleException;
import com.compass.exception.VehicleNotFoundException;
import com.compass.model.Vehicle;
import java.util.List;

public class VehicleService {
    private final VehicleController vehicleController;

    public VehicleService() {
        vehicleController = new VehicleController();
    }

    // Method to add a vehicle
    public void addVehicle(Vehicle vehicle) {
        try {
            vehicleController.addVehicle(vehicle);
            System.out.println("Vehicle added successfully.");
        } catch (InvalidVehicleException e) {
            System.out.println("Error adding vehicle: " + e.getMessage());
        }
    }

    // Method to get all vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicleController.getAllVehicles();
    }

    // Method to find a vehicle by its index
    public Vehicle getVehicle(int index) throws VehicleNotFoundException {
        return vehicleController.getVehicle(index);
    }

    // Method to perform maintenance on a vehicle
    public void performMaintenance(int index) {
        try {
            Vehicle vehicle = getVehicle(index);
            vehicle.performMaintenance();
        } catch (VehicleNotFoundException e) {
            System.out.println("Error performing maintenance: " + e.getMessage());
        }
    }

    // Method to load cargo for a specific vehicle
    public void loadCargo(int index, double weight) {
        vehicleController.loadCargo(index, weight);
    }

    // Method to unload cargo for a specific vehicle
    public void unloadCargo(int index, double weight) {
        vehicleController.unloadCargo(index, weight);
    }
}
