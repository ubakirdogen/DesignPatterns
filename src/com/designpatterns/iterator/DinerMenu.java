package com.designpatterns.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    public static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    MenuItem[] menuItems;


    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Meal 1", "Description of Meal 1", false, 5.19);
        addItem("Meal 2", "Description of Meal 2", true, 4.19);
        addItem("Meal 3", "Description of Meal 3", false, 8.19);
        addItem("Meal 4", "Description of Meal 4", true, 7.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, you cannot add more items, the menu is full");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
