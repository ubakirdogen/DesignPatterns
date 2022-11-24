package com.designpatterns.decorator;

public class CondimentWhip extends CondimentDecorator {

    public CondimentWhip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.49;
    }
}
