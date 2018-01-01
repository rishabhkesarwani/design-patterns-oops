package com.rishabhkesarwani;

import java.util.ArrayList;

public class OrderAction implements Action {

    private ArrayList<String> response = new ArrayList<>();
    private String argument;

    OrderAction(String argument) {
        this.argument = argument;
    }

    @Override
    public void perform() {
        if (argument.equals("cart")) {
            Cart cart = Cart.getInstance();
            response.add("Order Placed. Pay "+ cart.getTotalAmount());
            cart.placeOrder();
        } else {
            response.add("order what?");
        }
    }

    @Override
    public ArrayList<String> response() {
        return response;
    }
}
