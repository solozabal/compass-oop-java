package com.compass.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.compass.exception.InvalidVehicleException;
import com.compass.model.Car;
import com.compass.model.Fuel;

public class VehicleControllerTest {
    @Test
    public void testAddVehicle() throws InvalidVehicleException {
        VehicleController controller = new VehicleController();
        Car car = new Car(true, true, 4, 4, 4, false, 500, new Fuel(true, false, false, false, false, false), true, true);
        controller.addVehicle(car);
        assertEquals(1, controller.getAllVehicles().size());
    }

    @Test
    public void testAddInvalidVehicle() {
        VehicleController controller = new VehicleController();
        Exception exception = assertThrows(InvalidVehicleException.class, () -> {
            controller.addVehicle(new Car(true, true, -1, 4, 4, false, 500, new Fuel(true, false, false, false, false, false), true, true));
        });
        assertEquals("Passenger capacity cannot be negative.", exception.getMessage());
    }
}