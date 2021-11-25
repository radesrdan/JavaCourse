package com.udemy.CompositionHouse;

public class Bedroom {

    private Hallway hallway;
    private int widthSize;
    private int heightSize;
    private String roomColor;

    public Bedroom(Hallway hallway, int widthSize, int heightSize, String roomColor) {
        this.hallway = hallway;
        this.widthSize = widthSize;
        this.heightSize = heightSize;
        this.roomColor = roomColor;
    }

    public Hallway getHallway() {
        return hallway;
    }

    public int getWidthSize() {
        return widthSize;
    }

    public int getHeightSize() {
        return heightSize;
    }

    public String getRoomColor() {
        return roomColor;
    }

    public void turnOnLights(boolean turnOnLights) {
        System.out.println(turnOnLights ? "Lights have been turned on" : "Lights have been turned off");
    }
}
