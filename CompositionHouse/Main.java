package com.udemy.CompositionHouse;

public class Main {

    public static void main(String[] args) {

        Hallway hallway = new Hallway("Burgundy",100,false);
        Kitchen kitchen = new Kitchen(hallway,"Yellow",true,true);
        Bedroom bedroom = new Bedroom(hallway,22,33,"Orange");
        Livingroom livingroom = new Livingroom(hallway,22,55,"Pink");

        Home home = new Home(kitchen,bedroom,hallway,livingroom);

        home.getBedroom().turnOnLights(true);
        home.getKitchen().prepareFood(false);




    }
}
