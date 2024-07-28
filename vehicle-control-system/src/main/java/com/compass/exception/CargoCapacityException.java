package com.compass.exception;

/**
 * Exception thrown when a vehicle exceeds its cargo capacity.
 */
public class CargoCapacityException extends Exception {
    public CargoCapacityException(String message) {
        super(message);
    }
}