package com.compass.interfaces;

public interface VehicleStrategy {
    void move(); // Método para mover o veículo
    int getPassengerCapacity(); // Obter a capacidade de passageiros do veículo
    String getVehicleType(); // Obter o tipo do veículo
}