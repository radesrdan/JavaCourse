package com.udemy.CompositionHouse;

public class Livingroom {

    private Hallway hallway;
    private int widthSize;
    private int heightSize;
    private String roomColor;

    public Livingroom(Hallway hallway, int widthSize, int heightSize, String roomColor) {
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

    public void turnOnTv(boolean turnOn) {
        //ternary operation below, google if in need of more info oracle documentation
        System.out.println(turnOn ? "TV has been turned on" : "TV has been turned off");

    }


}
