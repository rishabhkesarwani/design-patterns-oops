package com.rishabhkesarwani;

import java.util.ArrayList;

class TanishaStore implements Store {

    private ArrayList<Item> itemsSelling = new ArrayList<>();

    private Order order = new Order();

    public TanishaStore() {
        ItemBuilder itemBuilder = new ItemBuilder();
        itemsSelling.add(itemBuilder.makeMobile("iPhone6", 6000, "Apple"));
        itemsSelling.add(itemBuilder.makeLaptop("HPZ", 1000, 250));
        itemsSelling.add(itemBuilder.makeMobile("iPhone7", 7000, "Apple"));
        itemsSelling.add(itemBuilder.makeLaptop("Lenovo", 2000, 500));
    }

    @Override
    public String getName() {
        return "TanishaStore";
    }

    @Override
    public void returnItem(Item item) {
        order.removeItem(item);
        itemsSelling.add(item);
    }

    @Override
    public void sellItem(Item item) {
        itemsSelling.remove(item);
        order.addItem(item);
    }

    @Override
    public ArrayList<Item> getItemsSelling() {
        return itemsSelling;
    }

    @Override
    public void cancelOrder() {
        for (Item item: order.getAllItems()) {
            returnItem(item);
        }
    }

    @Override
    public Order getOrder() {
        return order;
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