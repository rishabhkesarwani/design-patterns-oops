package com.rishabhkesarwani;

import java.util.ArrayList;

public class StoreListing {

    private ArrayList<Store> storeList = new ArrayList<>();

    private StoreListing() {
        this.listStore(new TanishaStore());
        this.listStore(new SikingStore());
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    private void listStore(Store s) {
        if (storeList.indexOf(s) == -1) {
            storeList.add(s);
        }
    }
}