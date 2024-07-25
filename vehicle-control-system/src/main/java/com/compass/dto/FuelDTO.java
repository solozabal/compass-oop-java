package com.compass.dto;

public class FuelDTO {
    private boolean gasoline; // Indicates if the fuel is gasoline
    private boolean alcohol; // Indicates if the fuel is alcohol
    private boolean diesel; // Indicates if the fuel is diesel
    private boolean electricity; // Indicates if the fuel is electricity
    private boolean human; // Indicates if the fuel is human-powered
    private boolean animal; // Indicates if the fuel is animal-powered

    // Constructor
    public FuelDTO(boolean gasoline, boolean alcohol, boolean diesel, 
                   boolean electricity, boolean human, boolean animal) {
        this.gasoline = gasoline;
        this.alcohol = alcohol;
        this.diesel = diesel;
        this.electricity = electricity;
        this.human = human;
        this.animal = animal;
    }

    // Getters and Setters
    public boolean isGasoline() {
        return gasoline;
    }

    public void setGasoline(boolean gasoline) {
        this.gasoline = gasoline;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public boolean isElectricity() {
        return electricity;
    }

    public void setElectricity(boolean electricity) {
        this.electricity = electricity;
    }

    public boolean isHuman() {
        return human;
    }

    public void setHuman(boolean human) {
        this.human = human;
    }

    public boolean isAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }
}
