package com.udemy.CompositionHouse;

public class Hallway {
    private String carpetColor;
    private int length;
    private boolean lightsOn;

    public Hallway(String carpetColor, int length, boolean lightsOn) {
        this.carpetColor = carpetColor;
        this.length = length;
        this.lightsOn = lightsOn;
    }

    public String getCarpetColor() {
        return carpetColor;
    }

    public int getLength() {
        return length;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }


}
