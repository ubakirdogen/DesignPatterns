package com.designpatterns.factory;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore() {
        storeName = "NY Pizza Store";
        cutStyle = "Diagonal";
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Pizza1")) {
            pizza = new NYStylePizza1();
        } else if (type.equals("Pizza2")) {
            pizza = new NYStylePizza2();
        }
        return pizza;
    }
}
