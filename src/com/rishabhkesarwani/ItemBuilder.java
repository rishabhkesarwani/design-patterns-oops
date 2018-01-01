package com.rishabhkesarwani;

public class ItemBuilder {

    public Mobile makeMobile(String name, int price, String brand) {
        Mobile mobile = new Mobile();
        mobile.setName(name);
        mobile.setPrice(price);
        mobile.setBrand(brand);
        return mobile;
    }

    public Laptop makeLaptop(String name, int price, int hardDiskSize) {
        Laptop laptop = new Laptop();
        laptop.setName(name);
        laptop.setPrice(price);
        laptop.setHardDiskSize(hardDiskSize);
        return laptop;
    }

}