package com.compass.controller;

import com.compass.exception.CargoCapacityException;
import com.compass.exception.InvalidVehicleException;
import com.compass.exception.VehicleNotFoundException;
import com.compass.model.Car;
import com.compass.model.Fuel;
import com.compass.model.Truck;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleControllerTest {
    private VehicleController controller;

    @BeforeEach
    void setUp() {
        controller = new VehicleController(); // Inicializa o VehicleController antes de cada teste
    }

    @Test
    void testAddVehicle() throws InvalidVehicleException {
        Car car = new Car(true, true, 4, 4, 4, false, 500, new Fuel(true, false, false, false, false, false), true, true);
        controller.addVehicle(car);
        assertEquals(1, controller.getAllVehicles().size());
    }

    @Test
    void testAddInvalidVehicle() {
        Exception exception = assertThrows(InvalidVehicleException.class, () -> {
            controller.addVehicle(new Car(true, true, -1, 4, 4, false, 500, new Fuel(true, false, false, false, false, false), true, true));
        });
        assertEquals("Passenger capacity cannot be negative.", exception.getMessage());
    }

    @Test
    void testEditVehicle() throws InvalidVehicleException, VehicleNotFoundException {
        Car car = new Car(true, true, 4, 4, 4, false, 500, new Fuel(true, false, false, false, false, false), true, true);
        controller.addVehicle(car);
        Car updatedCar = new Car(true, true, 5, 4, 4, false, 500, new Fuel(true, false, false, false, false, false), true, true);
        controller.editVehicle(0, updatedCar);
        assertEquals(5, controller.getVehicle(0).getPassengerCapacity());
    }

    @Test
    void testRemoveVehicle() throws InvalidVehicleException, VehicleNotFoundException {
        Car car = new Car(true, true, 4, 4, 4, false, 500, new Fuel(true, false, false, false, false, false), true, true);
        controller.addVehicle(car);
        controller.removeVehicle(0);
        assertEquals(0, controller.getAllVehicles().size());
    }

    @Test
    void testLoadCargo() throws InvalidVehicleException, VehicleNotFoundException, CargoCapacityException {
        Truck truck = new Truck(true, true, 2, 2, 6, true, 1000, new Fuel(true, false, false, false, false, false), 4);
        controller.addVehicle(truck);
        truck.loadCargo(300); // Chama o método loadCargo do Truck
        assertEquals(300, truck.getCurrentCargo()); // Verifica a carga atual
    }

    @Test
    void testUnloadCargo() throws InvalidVehicleException, CargoCapacityException, VehicleNotFoundException {
        Truck truck = new Truck(true, true, 2, 2, 6, true, 1000, new Fuel(true, false, false, false, false, false), 4);
        controller.addVehicle(truck);
        truck.loadCargo(400); // Carrega 400 kg
        truck.unloadCargo(100); // Descarrega 100 kg
        assertEquals(300, truck.getCurrentCargo()); // Verifica se a carga atual é 300
    }
}