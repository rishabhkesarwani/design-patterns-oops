package com.rishabhkesarwani;

import java.util.ArrayList;

public class Cart {

    private static Cart onlyInstance = null;

    private ArrayList<Store> storesInvolved = new ArrayList<>();

    public static Cart getInstance() {
        if (onlyInstance == null) {
            onlyInstance = new Cart();
        }
        return onlyInstance;
    }

    public int getTotalAmount() {
        int totalAmount = 0;
        for (Store store : storesInvolved) {
            totalAmount += store.getOrder().getTotalAmount();
        }
        return totalAmount;
    }

    public void addItem(Item item) {
        Store store = StoreListing.getInstance().getSelectedStore();
        store.sellItem(item);
        storesInvolved.add(store);
    }

    public void placeOrder() {
        for (Store store : storesInvolved) {
            store.getOrder().placeOrder();
        }
    }

    public void cancel() {
        for (Store store : storesInvolved) {
            store.cancelOrder();
        }
    }

}
