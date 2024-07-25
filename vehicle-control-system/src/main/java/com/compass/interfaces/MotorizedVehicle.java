package com.compass.interfaces;

public interface MotorizedVehicle extends VehicleStrategy {
    void startEngine(); // Iniciar o motor do veículo
    void stopEngine(); // Parar o motor do veículo
    void loadCargo(double weight); // Carregar carga no veículo
    void unloadCargo(); // Descarregar a carga do veículo
}