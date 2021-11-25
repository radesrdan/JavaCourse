package com.example.finalfield;

public class Main {

    public static void main(String[] args) {

//        RandomClass randomClass1 = new RandomClass("one");
//        RandomClass randomClass2 = new RandomClass("two");
//        RandomClass randomClass3 = new RandomClass("three");
//        RandomClass randomClass4 = new RandomClass("four");
//
//        System.out.println(randomClass1.getInstanceNumber());
//        System.out.println(randomClass2.getInstanceNumber());
//        System.out.println(randomClass3.getInstanceNumber());
//        System.out.println(randomClass4.getInstanceNumber());
//
//        int pw = 75634;
//        Password password = new ExtendedPassword(pw);
//        password.storePasswprd();
//        password.letMeIn(1);
//        password.letMeIn(534535);
//        password.letMeIn(-1);
//        password.letMeIn(0);
//        password.letMeIn(75634);


        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is" + SIBTest.owner);
    }

}
