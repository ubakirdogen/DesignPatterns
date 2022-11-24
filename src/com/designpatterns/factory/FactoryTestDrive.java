package com.designpatterns.factory;

public class FactoryTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizzaFromNY = nyStore.orderPizza("Pizza1");
        System.out.println("You ordered a " + pizzaFromNY.getName() + "\n");
        System.out.println("*********");
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizzaFromChicago = chicagoStore.orderPizza("Pizza2");
        System.out.println("You ordered a " + pizzaFromChicago.getName() + "\n");

    }
}
