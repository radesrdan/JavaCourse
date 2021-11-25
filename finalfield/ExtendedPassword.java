package com.example.finalfield;

public class ExtendedPassword extends Password{

    private int decryptPassword;

    public ExtendedPassword(int encryptedPassword) {
        super(encryptedPassword);
        this.decryptPassword = encryptedPassword;
    }
//
//    @Override
//    public void storePasswprd() {
//        System.out.println("Saving password as "+ this.decryptPassword);
//    }
}
