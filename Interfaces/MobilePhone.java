package com.udemy.Interfaces;

public class MobilePhone implements ITelephone{
    private int myPhoneNumber;
    private boolean isRinging;
    private boolean isDeviceOn;

    @Override
    public void powerOn() {
        System.out.println("Mobile phone has been powered up.");
        isDeviceOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if (isDeviceOn){
            System.out.println("Now ringing mobile phone, phone number: " + phoneNumber);
        }
        System.out.println("Device is not turned on");

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the Mobile Phone");
            isRinging = false;
        } else {
            System.out.println("Failed to pick up the phone, phone is not on or number is different");
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myPhoneNumber && isDeviceOn) {
            System.out.println("Mobile Phone is ringing");
            isRinging = true;
            return true;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {

        return isRinging;
    }

    public MobilePhone(int myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        this.isDeviceOn = false;
    }
}
