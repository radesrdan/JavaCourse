package com.udemy.CompositionHouse;

public class Home {
    // Class containing all the composing rooms
    private Kitchen kitchen;
    private Bedroom bedroom;
    private Hallway hallway;
    private Livingroom livingroom;

    public Home(Kitchen kitchen, Bedroom bedroom, Hallway hallway, Livingroom livingroom) {
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.hallway = hallway;
        this.livingroom = livingroom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public Hallway getHallway() {
        return hallway;
    }

    public Livingroom getLivingroom() {
        return livingroom;
    }
}
