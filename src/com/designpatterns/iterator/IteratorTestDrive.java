package com.designpatterns.iterator;

import java.util.Iterator;

public class IteratorTestDrive {
    public static void main(String[] args) {
        Menu dinerMenu = new DinerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu cafeMenu = new CafeMenu();

        printMenu(dinerMenu);
        System.out.println("**************");
        printMenu(pancakeHouseMenu);
        System.out.println("**************");
        printMenu(cafeMenu);
    }

    public static void printMenu(Menu menu) {
        if (menu == null) {
            System.out.println("Menu is empty");
            return;
        }
        Iterator<MenuItem> menuIterator = menu.createIterator();
        while (menuIterator.hasNext()) {
            System.out.println(menuIterator.next());
        }
    }
}
