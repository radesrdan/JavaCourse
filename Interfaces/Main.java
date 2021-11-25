package com.udemy.Interfaces;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
//        timsPhone = new DeskPhone(124648676);
//        timsPhone.callPhone(123123);
//        timsPhone.answer();

        timsPhone = new MobilePhone(003623123);
        timsPhone.powerOn();
        timsPhone.callPhone(003623123);
        timsPhone.answer();




    }
}
