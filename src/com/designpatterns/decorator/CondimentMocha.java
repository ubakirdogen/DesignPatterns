package com.designpatterns.decorator;

public class CondimentMocha extends CondimentDecorator {

    public CondimentMocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.69;
    }
}
