package com.javaclass.first.exercises.marko_02_data_types.pass_by_reference;

public class Motorcycle extends Vehicle {
    private String mileage;

    public Motorcycle(String name, String type, String fuelType, int wheelsNumber, String mileage) {
        super(name, type, fuelType, wheelsNumber);
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        String information;
        information = " Mileage: " + this.mileage;
        return super.toString() + "\n " + information;
    }
}
