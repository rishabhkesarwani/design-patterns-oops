package com.rishabhkesarwani;

import java.util.ArrayList;

public class SikingStore implements Store {

    private ArrayList<Item> itemsSelling = new ArrayList<>();

    public SikingStore() {
        ItemBuilder itemBuilder = new ItemBuilder();
        itemsSelling.add(itemBuilder.makeMobile("MotorolaG4", 5000, "Motorola"));
        itemsSelling.add(itemBuilder.makeLaptop("MacbookPro", 8000, 250));
        itemsSelling.add(itemBuilder.makeMobile("MotorolaG5", 6000, "Motorola"));
        itemsSelling.add(itemBuilder.makeLaptop("Dell", 3000, 1000));
    }

    @Override
    public String getName() {
        return "SikingStore";
    }

    @Override
    public void returnItem(Item item) {
        itemsSelling.add(item);
    }

    @Override
    public void sellItem(Item item) {
        itemsSelling.remove(item);
    }

    @Override
    public ArrayList<Item> getItemsSelling() {
        return itemsSelling;
    }

    @Override
    public ArrayList<String> getSearcher() {
        ArrayList<String> searcher = new ArrayList<>();
        for (Item item: itemsSelling) {
            searcher.add(item.getName());
        }
        return searcher;
    }
}
