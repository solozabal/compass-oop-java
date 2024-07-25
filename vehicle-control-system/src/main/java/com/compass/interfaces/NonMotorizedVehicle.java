package com.compass.interfaces;

public interface NonMotorizedVehicle extends VehicleStrategy {
    void loadCargo(); // Método opcional para carregar carga (se aplicável)
    void unloadCargo(); // Método opcional para descarregar carga (se aplicável)
}