package com.rishabhkesarwani;

import java.util.ArrayList;

public class SikingStore implements Store {

    private ArrayList<Item> itemsSelling = new ArrayList<>();

    public SikingStore() {
        Mobile mobile1 = new Mobile();
        mobile1.setName("MotorolaG4");
        mobile1.setPrice(5000);
        mobile1.setBrand("Motorola");
        itemsSelling.add(mobile1);
        Laptop laptop1 = new Laptop();
        laptop1.setName("MacbookPro");
        laptop1.setPrice(8000);
        laptop1.setHardDiskSize(250);
        itemsSelling.add(laptop1);
        Mobile mobile2 = new Mobile();
        mobile2.setName("MotorolaG5");
        mobile2.setPrice(6000);
        mobile2.setBrand("Motorola");
        itemsSelling.add(mobile2);
        Laptop laptop2 = new Laptop();
        laptop2.setName("Dell");
        laptop2.setPrice(3000);
        laptop2.setHardDiskSize(1000);
        itemsSelling.add(laptop2);
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

}
