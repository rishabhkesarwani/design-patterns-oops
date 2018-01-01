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

    }

    @Override
    public ArrayList<String> response() {
        return response;
    }
}
