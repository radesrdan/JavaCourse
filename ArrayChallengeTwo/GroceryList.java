package com.udemy.ArrayChallengeTwo;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> arrayList = new ArrayList<String>();

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void addGroceryItem(String item) {
        arrayList.add(item);
    }

    public void printOutArrayList() {
        for (int i = 0; i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }

    }

    public void modifyGroceryListItem (String newItem, String currentItemName){
        int position = arrayList.indexOf(currentItemName);

        if (position >= 0) {
            arrayList.set(position,newItem);
        } else {
            System.out.println("Item "+ currentItemName + " doesn't exist");
        }
    }

    public void removeGroceryListItem (String removalItem){
        int position = arrayList.indexOf(removalItem);

        if (position >= 0) {
            arrayList.remove(position);
        } else {
            System.out.println("Item "+ removalItem + " doesn't exist in the list");
        }
    }

    public String findItem (String searchItem) {
//        boolean exists = arrayList.contains(searchItem);  //checks if the item exists or not, returns bool value
        int position = arrayList.indexOf(searchItem);

        if (position >= 0) {
            return arrayList.get(position);
        }
        return null;
    }


}
