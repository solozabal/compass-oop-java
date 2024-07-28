package com.compass.exception;

/**
 * Exception thrown when a vehicle is not found in the system.
 */
public class VehicleNotFoundException extends Exception {
    public VehicleNotFoundException(String message) {
        super(message);
    }
}