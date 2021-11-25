package com.udemy.ArrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;

    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<Contacts>();
        this.myNumber = myNumber;
    }



    //returns index value INT
    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);
    }

    private int findContact (String contactName) {
        for (int i = 0 ; i < myContacts.size(); i++) {
            Contacts contacts = this.myContacts.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact (Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getName();
        }
        return null;
    }


    public boolean removeContact (Contacts contacts) {
        int foundPosition = findContact(contacts);
        if (foundPosition < 0 ) {
            System.out.println(contacts.getName() +" could not be found. ");
            return false;
        } else {
            this.myContacts.remove(foundPosition);
            System.out.println(contacts.getName() +" has been removed. ");
            return true;
        }
    }


    public boolean updateContact (Contacts oldContact, Contacts newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0 ) {
            System.out.println(oldContact.getName() +" does not exist anymore. ");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
                System.out.println("The contact "+newContact.getName()+" already exists");
                return false;
            }
            this.myContacts.set(foundPosition,newContact);
            System.out.println(newContact.getName() +" has been added. ");
            return true;

    }

    public boolean addNewContact(Contacts contacts) {
        if (findContact(contacts.getName()) >= 0) {
            System.out.println("Contact is already in the file");
            return false;
        }
        myContacts.add(contacts);
        return true;
    }

    public void printContacts () {
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i+1)+". Contact name: " + this.myContacts.get(i).getName() + " phone number: " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public Contacts qureyContactName (String name) {
        int position = findContact(name);
        if (position < 0) {
            return null;
        } else {
            return this.myContacts.get(position);
        }

    }




}

