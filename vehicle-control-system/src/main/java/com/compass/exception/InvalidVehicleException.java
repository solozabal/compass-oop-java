package com.compass.exception;

/**
 * Exception thrown when a vehicle has invalid parameters, such as negative passenger capacity or cargo capacity.
 */
public class InvalidVehicleException extends Exception {
    /**
     * Constructor that accepts a message.
     * 
     * @param message the detail message explaining the reason for the exception
     */
    public InvalidVehicleException(String message) {
        super(message);
    }
}