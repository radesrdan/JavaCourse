package com.udemy.Composition;

public class PersonalComputer {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp () {
        theCase.pressPowerButton();
        drawLogo();
    }
    public void drawLogo() {
        // fancy logo drawing
        monitor.drawPixelAt(1232,5943,"Green");

    }



}
