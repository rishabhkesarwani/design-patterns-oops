package com.rishabhkesarwani;

import java.util.ArrayList;

public class StoreListing {

    private static StoreListing onlyInstance = null;

    private ArrayList<Store> storeList = new ArrayList<>();

    private StoreListing() {
        this.listStore(new TanishaStore());
        this.listStore(new SikingStore());
    }

    public static StoreListing getInstance() {
        if (onlyInstance == null) {
            onlyInstance = new StoreListing();
        }
        return onlyInstance;
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