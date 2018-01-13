package com.javaclass.first.exercises.marko_02_data_types.pass_by_reference;

public abstract class Vehicle {
    private String name;
    private String type;
    private String fuelType;
    private int wheelsNumber;

    Vehicle(String name, String type, String fuelType, int wheelsNumber) {
        this.name = name;
        this.type = type;
        this.fuelType = fuelType;
        this.wheelsNumber = wheelsNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public String toString() {
        String inforamtions;
        inforamtions = "Name: " + this.name + ", " +
                "Vehicle type: " + this.type + ", " +
                "Fuell type: " + this.fuelType + ", " +
                "Number of wheels: " + this.wheelsNumber + ".";
        return  inforamtions;
    }
}
