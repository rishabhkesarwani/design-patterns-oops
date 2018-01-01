package com.rishabhkesarwani;

import java.util.ArrayList;

public class CancelAction implements Action{

    private ArrayList<String> response = new ArrayList<>();
    private String argument;

    CancelAction(String argument) {
        this.argument = argument;
    }

    @Override
    public void perform() {
        if (argument.equals("order")) {
            Cart.getInstance().cancel();
            response.add("Order Cancelled");
        } else {
            response.add("cancel what?");
        }
    }

    @Override
    public ArrayList<String> response() {
        return response;
    }
}
