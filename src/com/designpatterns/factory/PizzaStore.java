package com.designpatterns.factory;

public abstract class PizzaStore {
    String storeName;
    String cutStyle;

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut(cutStyle);
        pizza.box();
        return pizza;
    }
}
