package com.compass.interfaces;

public interface FuelStrategy {
    void refuel(double amount); // Reabastecer o veículo
    double getFuelLevel(); // Obter o nível atual de combustível
    void checkFuelEfficiency(); // Verificar a eficiência do combustível
    void calculateFuelCost(double pricePerLiter); // Calcular o custo do combustível
}