package com.compass.model;

public class Bicycle extends Vehicle {
    private boolean isElectric; // Indicates if the bicycle is electric
    private boolean hasBasket; // Indicates if the bicycle has a basket

    // Constructor
    public Bicycle(boolean hasEngine, boolean hasSteeringWheel, int passengerCapacity, 
                   int numberOfDoors, int numberOfWheels, boolean isCargo, 
                   double cargoCapacity, Fuel fuel, boolean isElectric, boolean hasBasket) {
        super(hasEngine, hasSteeringWheel, passengerCapacity, numberOfDoors, 
              numberOfWheels, isCargo, cargoCapacity, fuel);
        this.isElectric = isElectric;
        this.hasBasket = hasBasket;
    }

    // Getters and Setters
    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public boolean hasBasket() {
        return hasBasket;
    }

    public void setBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
}
