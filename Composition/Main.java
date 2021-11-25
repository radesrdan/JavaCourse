package com.udemy.Composition;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(221, 350, 5);
        Case theCase = new Case("22C", "HP", "89BG", dimensions);

        Monitor theMonitor = new Monitor("17innch Beast", "Dell", 12, new Resolution(2540, 5500));

        Motherboard theMotherboard = new Motherboard("GB12", "Dell", 2, 2, "Louda");

        PersonalComputer pc = new PersonalComputer(theCase, theMonitor, theMotherboard);

        pc.powerUp();
    }
}
