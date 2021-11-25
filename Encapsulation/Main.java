package com.udemy.Encapsulation;

public class Main {

    public static void main(String[] args) {

//        EnhancedPlayer player = new EnhancedPlayer("Rade",100,"Antenna pole");
//        System.out.println("Initial health is "+ player.getHealth());
//        player.loseHealth(22);
//        System.out.println("Current health is "+ player.getHealth());

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

    }
}
