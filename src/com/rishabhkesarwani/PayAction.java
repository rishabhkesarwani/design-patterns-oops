package com.rishabhkesarwani;

import java.util.ArrayList;

public class PayAction implements Action {

    private ArrayList<String> response = new ArrayList<>();
    private String argument;

    PayAction(String argument) {
        this.argument = argument;
    }

    @Override
    public void perform() {
        int amountPaid = Integer.parseInt(argument);
        if (amountPaid < Cart.getInstance().getTotalAmount()) {
            response.add("Please pay full amount");
        } else {
            response.add("Your Payment is successful!");
        }
    }

    @Override
    public ArrayList<String> response() {
        return response;
    }
}
