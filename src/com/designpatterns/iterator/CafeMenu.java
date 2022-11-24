package com.designpatterns.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Cafe Meal 1", "Description of Cafe Meal 1", false, 7.25);
        addItem("Cafe Meal 2", "Description of Cafe Meal 2", false, 5.25);
        addItem("Cafe Meal 3", "Description of Cafe Meal 3", false, 6.00);
        addItem("Cafe Meal 4", "Description of Cafe Meal 4", false, 10.99);


    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
