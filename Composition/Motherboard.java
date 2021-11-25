package com.udemy.Composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int videoCardSlots;
    private String nameOfBios;

    public Motherboard(String model, String manufacturer, int ramSlots, int videoCardSlots, String nameOfBios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.videoCardSlots = videoCardSlots;
        this.nameOfBios = nameOfBios;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getVideoCardSlots() {
        return videoCardSlots;
    }

    public String getNameOfBios() {
        return nameOfBios;
    }

    public void loadProgram (String programName) {
        System.out.println("Program " + programName + " is loaded.");

    }
}
