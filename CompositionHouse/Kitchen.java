package com.udemy.CompositionHouse;

public class Kitchen {

    private Hallway hallway;
    private String roomColor;
    private boolean isWaterRunning;
    private boolean isOvenWorking;

    public Kitchen(Hallway hallway, String roomColor, boolean isWaterRunning, boolean isOvenWorking) {
        this.hallway = hallway;
        this.roomColor = roomColor;
        this.isWaterRunning = isWaterRunning;
        this.isOvenWorking = isOvenWorking;
    }

    public Hallway getHallway() {
        return hallway;
    }

    public String getRoomColor() {
        return roomColor;
    }

    public boolean isWaterRunning() {
        return isWaterRunning;
    }

    public boolean isOvenWorking() {
        return isOvenWorking;
    }

    public void prepareFood(boolean isSuccess) {
        System.out.println(isSuccess ? "Food has been cooked successfully" : "The kitchen and the house have burned down....");
    }
}
