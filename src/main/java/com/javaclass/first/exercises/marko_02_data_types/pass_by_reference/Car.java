package com.javaclass.first.exercises.marko_02_data_types.pass_by_reference;

public class Car extends  Vehicle {
    private int doorsNumber;
    private int seatsNumber;

    Car(String name, String type, String fuelType, int wheelsNumber, int doorsNumber, int seatsNumber) {

        super(name, type, fuelType, wheelsNumber);
        this.doorsNumber = doorsNumber;
        this.seatsNumber = seatsNumber;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString() {
        String informaations;
        informaations = "Number of doors: " + this.doorsNumber + ", " + "Number of seats: " + this.seatsNumber + ". ";
        return super.toString() + "\n" + informaations;
    }
}
