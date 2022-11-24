package com.designpatterns.factory;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {
        storeName = "Chicago Pizza Store";
        cutStyle = "Square";
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Pizza1")) {
            pizza = new ChicagoStylePizza1();
        } else if (type.equals("Pizza2")) {
            pizza = new ChicagoStylePizza2();
        }
        return pizza;
    }
}
