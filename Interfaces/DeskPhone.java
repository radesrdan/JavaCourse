package com.udemy.Interfaces;

public class DeskPhone implements ITelephone{
    private int myPhoneNumber;
    private boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing");

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the deskphone");
            isRinging = false;
        } else {
            System.out.println("Failed to pick up the phone");
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myPhoneNumber) {
            System.out.println("Phone is ringing");
            isRinging = true;
            return true;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {

        return isRinging;
    }

    public DeskPhone(int myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }
}
