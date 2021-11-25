package com.example.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theater Theater = new Theater("Olympian", 8, 12);

        if(Theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(Theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(Theater.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theater.Seat> reverseSeats = new ArrayList<>(Theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


        List<Theater.Seat> priceSeats = new ArrayList<>(Theater.getSeats());
        priceSeats.add(Theater.new Seat("F00", 12.00));
        priceSeats.add(Theater.new Seat("D00", 12.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);
    }


    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================================");
    }
}
