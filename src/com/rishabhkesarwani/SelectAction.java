package com.rishabhkesarwani;

import java.util.ArrayList;

public class SelectAction implements Action {

    private ArrayList<String> response = new ArrayList<>();
    private String argument;

    SelectAction(String argument) {
        this.argument = argument;
    }

    @Override
    public void perform() {
        StoreListing storeListing = StoreListing.getInstance();
        storeListing.setSelectedStore(argument);
        response.addAll(storeListing.getSelectedStore().getSearcher());
    }

    @Override
    public ArrayList<String> response() {
        return response;
    }
}
