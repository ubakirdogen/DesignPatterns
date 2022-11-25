package com.designpatterns.composite;

public class CompositeTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        // add items to diner menu
        dinerMenu.add(new MenuItem("Diner Meal 1", "Description of Diner Meal 1", false, 5.19));
        dinerMenu.add(new MenuItem("Diner Meal 2", "Description of Diner Meal 2", true, 6.19));
        dinerMenu.add(new MenuItem("Diner Meal 3", "Description of Diner Meal 3", false, 7.19));
        dinerMenu.add(new MenuItem("Diner Meal 4", "Description of Diner Meal 4", true, 8.19));

        dinerMenu.add(dessertMenu);
        // add items to dessert menu
        dinerMenu.add(new MenuItem("Dessert 1", "Description of Dessert 1", false, 2.39));
        dinerMenu.add(new MenuItem("Dessert 2", "Description of Dessert 2", false, 3.39));
        dinerMenu.add(new MenuItem("Dessert 3", "Description of Dessert 3", false, 4.39));
        dinerMenu.add(new MenuItem("Dessert 4", "Description of Dessert 4", false, 5.39));

        // add items to cafe menu
        cafeMenu.add(new MenuItem("Cafe Meal 1", "Description of Cafe Meal 1", false, 5.19));
        cafeMenu.add(new MenuItem("Cafe Meal 2", "Description of Cafe Meal 2", true, 6.19));
        cafeMenu.add(new MenuItem("Cafe Meal 3", "Description of Cafe Meal 3", false, 7.19));
        cafeMenu.add(new MenuItem("Cafe Meal 4", "Description of Cafe Meal 4", true, 8.19));

        // add items to pancake house menu
        pancakeHouseMenu.add(new MenuItem("Pancake 1", "Description of Pancake 1", false, 5.19));
        pancakeHouseMenu.add(new MenuItem("Pancake 2", "Description of Pancake 2", true, 6.19));
        pancakeHouseMenu.add(new MenuItem("Pancake 3", "Description of Pancake 3", false, 7.19));
        pancakeHouseMenu.add(new MenuItem("Pancake 4", "Description of Pancake 4", true, 8.19));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
