package com.rishabhkesarwani;

import java.util.ArrayList;

class TanishaStore implements Store {

    private ArrayList<Item> itemsSelling = new ArrayList<>();

    public TanishaStore() {
        Mobile mobile1 = new Mobile();
        mobile1.setName("iPhone6");
        mobile1.setPrice(6000);
        mobile1.setBrand("Apple");
        itemsSelling.add(mobile1);
        Laptop laptop1 = new Laptop();
        laptop1.setName("HPZ");
        laptop1.setPrice(1000);
        laptop1.setHardDiskSize(250);
        itemsSelling.add(laptop1);
        Mobile mobile2 = new Mobile();
        mobile2.setName("iPhone7");
        mobile2.setPrice(7000);
        mobile2.setBrand("Apple");
        itemsSelling.add(mobile2);
        Laptop laptop2 = new Laptop();
        laptop2.setName("Lenovo");
        laptop2.setPrice(2000);
        laptop2.setHardDiskSize(500);
        itemsSelling.add(laptop2);
    }

    @Override
    public String getName() {
        return "TanishaStore";
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