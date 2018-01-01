package com.rishabhkesarwani;

import java.util.ArrayList;

public class StoreListing implements Searchable {

    private static StoreListing onlyInstance = null;

    private ArrayList<Store> storeList = new ArrayList<>();
    private String selectedStore = null;

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

    public void setSelectedStore(String name) {
        this.selectedStore = name;
    }

    public Store getSelectedStore() {
        Store storeMatched = null;
        for (Store store: storeList) {
            if (store.getName().equals(this.selectedStore)) {
                storeMatched = store;
                break;
            }
        }
        return storeMatched;
    }

    private void listStore(Store s) {
        if (storeList.indexOf(s) == -1) {
            storeList.add(s);
        }
    }

    @Override
    public ArrayList<String> getSearcher() {
        ArrayList<String> searcher = new ArrayList<>();
        for (Store store: storeList) {
            searcher.add(store.getName());
        }
        return searcher;
    }
}