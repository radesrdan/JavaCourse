package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String > languages = new HashMap<>();
        languages.put("Java" , "Compiled high level object-oriented, platform independent language.");
        languages.put("Python" , "an interpreted, object-oriented language, high level programming language.");
        languages.put("Prolog" , "Compiled high level programming language often used with AI and computational linguistics.");
        languages.put("C" , "General purpose/procedural programming language which uses a compiler based process");
        System.out.println(languages.put("JavaScript" , "A bit messed up tbh"));



        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java" , "This course is about Java"));
        }

        System.out.println("=====================");
        //print out all the keys in the hash map
        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println("======removing keys=========");
//        languages.remove("Lisp");
        if (languages.remove("Prolog","Compiled high level programming language often used with AI and computational linguistics.")) {
            System.out.println("Algo removed");
        } else {
            System.out.println("Algo could not be removed");
        }

        System.out.println("======replace=========");
        System.out.println(languages.replace("JavaScript", "a functional and oop language used in back-end and front-end"));
        System.out.println(languages.replace("Scala", "this will fail"));

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
