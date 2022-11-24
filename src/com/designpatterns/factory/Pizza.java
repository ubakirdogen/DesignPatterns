package com.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce..");
        System.out.println("Adding toppings");
        for (String topping : toppings) {
            System.out.println("    " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350 C°");
    }

    public void cut(String cutType) {
        System.out.println("Cutting the pizza into " + cutType + " slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore Box");
    }

    public String getName() {
        return name;
    }
}
