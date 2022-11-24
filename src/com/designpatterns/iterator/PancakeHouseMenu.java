package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("Pancake 1", "Description of Pancake 1", true, 2.99);
        addItem("Pancake 2", "Description of Pancake 2", false, 3.99);
        addItem("Pancake 3", "Description of Pancake 3", false, 1.99);
        addItem("Pancake 4", "Description of Pancake 4", true, 4.99);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }


    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
