package com.rishabhkesarwani;

import java.util.ArrayList;

public class Order {

    private ArrayList<Item> allItems = new ArrayList<>();

    public ArrayList<Item> getAllItems() {
        return allItems;
    }

    public void addItem(Item item) {
        allItems.add(item);
    }

    public void removeItem(Item item) {
        allItems.remove(item);
    }

    public int getTotalAmount() {
        int totalAmount = 0;
        for (Item item : allItems) {
            totalAmount += item.getPrice();
        }
        return totalAmount;
    }

    public void placeOrder() {
        allItems = new ArrayList<>();
    }

}
