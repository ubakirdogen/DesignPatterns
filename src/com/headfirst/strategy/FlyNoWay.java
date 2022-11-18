package com.headfirst.strategy;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
