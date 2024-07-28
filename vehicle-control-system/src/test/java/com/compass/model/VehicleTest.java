package com.compass.model;

import com.compass.exception.CargoCapacityException;
import com.compass.exception.InvalidVehicleException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testLoadCargo() throws InvalidVehicleException, CargoCapacityException {
        Vehicle vehicle = new Vehicle(true, true, 4, 4, 4, true, 500, new Fuel(true, false, false, false, false, false));
        vehicle.loadCargo(200);
        assertEquals(200, vehicle.getCurrentCargo());
    }

    @Test
    public void testUnloadCargo() throws InvalidVehicleException, CargoCapacityException {
        Vehicle vehicle = new Vehicle(true, true, 4, 4, 4, true, 500, new Fuel(true, false, false, false, false, false));
        vehicle.loadCargo(300);
        vehicle.unloadCargo(100);
        assertEquals(200, vehicle.getCurrentCargo());
    }

    @Test
    public void testLoadCargoExceedsCapacity() throws InvalidVehicleException, CargoCapacityException {
        Vehicle vehicle = new Vehicle(true, true, 4, 4, 4, true, 500, new Fuel(true, false, false, false, false, false));
        vehicle.loadCargo(500);
        Exception exception = assertThrows(CargoCapacityException.class, () -> {
            vehicle.loadCargo(100); // Tentativa de carregar mais do que a capacidade
        });
        assertEquals("Cargo exceeds the vehicle's capacity.", exception.getMessage());
    }

    @Test
    public void testPerformMaintenance() throws InvalidVehicleException, CargoCapacityException {
        Vehicle vehicle = new Vehicle(true, true, 4, 4, 4, true, 500, new Fuel(true, false, false, false, false, false));
        vehicle.loadCargo(300);
        // Aqui você pode verificar a saída padrão ou outros efeitos colaterais
        vehicle.performMaintenance();
    }
}