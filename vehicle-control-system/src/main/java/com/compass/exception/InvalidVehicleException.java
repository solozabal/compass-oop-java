package com.compass.exception;

public class InvalidVehicleException extends Exception {
    // Constructor that accepts a message
    public InvalidVehicleException(String message) {
        super(message); // Call the constructor of the superclass (Exception)
    }
}