package com.designpatterns.decorator;

public class CondimentSoy extends CondimentDecorator {

    public CondimentSoy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.29;
    }
}
