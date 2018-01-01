package com.rishabhkesarwani;

import java.util.ArrayList;

public interface Store extends Searchable {

    public String getName();

    public void returnItem(Item item);

    public void sellItem(Item item);

    public ArrayList<Item> getItemsSelling();

}