package com.designpatterns.iterator;

import java.util.Iterator;

public class IteratorTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        printMenu(dinerMenu);
        System.out.println("**************");
        printMenu(pancakeHouseMenu);

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
