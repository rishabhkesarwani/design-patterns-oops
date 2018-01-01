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
        for (Item item: storeListing.getSelectedStore().getItemsSelling()) {
            response.add(item.getName());
        }
    }

    @Override
    public ArrayList<String> response() {
        return response;
    }
}
