package com.example.finalfield;

public class Password {
    private static final int key = 54240768;
    private final int encryptedPassword;

    public Password(int encryptedPassword) {
        this.encryptedPassword = encryptPassword(encryptedPassword);
    }

    private int encryptPassword (int password) {
        return password ^ key;
    }

    public final void storePasswprd() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptPassword(password) == this.encryptedPassword) {
            System.out.println("Welcome to the application.");
            return true;
        }
        else {
            System.out.println("Your account is not valid");
            return false;
        }
    }
}
