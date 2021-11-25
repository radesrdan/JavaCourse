package com.example.adventure;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> temporaryExit = new HashMap<>();

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("W",2);
        temporaryExit.put("E",3);
        temporaryExit.put("S",4);
        temporaryExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill",temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("N",1);
        temporaryExit.put("W",4);
        locations.put(4, new Location(4, "You are in a valley beside a stream",temporaryExit));

        temporaryExit = new HashMap<>();
        temporaryExit.put("S",1);
        temporaryExit.put("W",2);
        locations.put(5, new Location(5, "You are in the forest",temporaryExit));

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT","Q");
        vocabulary.put("WEST","W");
        vocabulary.put("SOUTH","S");
        vocabulary.put("EAST","E");
        vocabulary.put("NORTH","N");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExists();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + " , ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] directionSplit = direction.split(" ");
                for (String dir : directionSplit) {
                    if (vocabulary.containsKey(dir)) {
                        direction = vocabulary.get(dir);
                        break;
                    }
                }
            }
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("Can not travel in that direction");
            }



        }


    }


}
