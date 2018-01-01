package com.rishabhkesarwani;

import java.util.ArrayList;

public class AddCartAction implements Action {

    private ArrayList<String> response = new ArrayList<>();
    private String argument;

    AddCartAction(String argument) {
        this.argument = argument;
    }

    @Override
    public void perform() {
        Cart cart = Cart.getInstance();
        Store store = StoreListing.getInstance().getSelectedStore();
        int index = store.getSearcher().indexOf(argument);
        if (index != -1) {
            Item item = store.getItemsSelling().get(index);
            cart.addItem(item);
            response.add(item.getName() + " added to your cart. Total amount: " + cart.getTotalAmount());
        } else {
            response.add("Item not found");
        }
    }

    @Override
    public ArrayList<String> response() {
        return response;
    }
}
