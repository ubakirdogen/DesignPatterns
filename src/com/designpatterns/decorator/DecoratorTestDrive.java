package com.designpatterns.decorator;

public class DecoratorTestDrive {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        Beverage beverageWithCondiments = new CondimentWhip(new CondimentMocha(new CondimentSoy(beverage)));

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        System.out.println("************");
        System.out.println(beverageWithCondiments.getDescription());
        System.out.println(beverageWithCondiments.cost());
    }
}
