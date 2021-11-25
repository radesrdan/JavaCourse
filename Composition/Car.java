package com.udemy.Composition;

public class Car extends Vehicle{

    private int numberOfDoors;
    private int horsePower;

    public Car(String name, int numberOfDoors, int horsePower) {
        super(name);
        this.numberOfDoors = numberOfDoors;
        this.horsePower = horsePower;
    }
}
