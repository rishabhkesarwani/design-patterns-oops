package com.rishabhkesarwani;

import java.util.ArrayList;

public class SearchAction implements Action {

    private ArrayList<String> response = new ArrayList<>();

    @Override
    public void perform(String argument) {

    }

    @Override
    public ArrayList<String> response() {
        return response;
    }
}
