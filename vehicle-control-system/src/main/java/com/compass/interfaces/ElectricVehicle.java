package com.compass.interfaces;

public interface ElectricVehicle {
    void chargeBattery(double amount); // Carregar a bateria do veículo
    double getBatteryLevel(); // Obter o nível atual da bateria
    void checkBatteryHealth(); // Verificar a saúde da bateria
    void enableRegenerativeBraking(); // Ativar a frenagem regenerativa
}