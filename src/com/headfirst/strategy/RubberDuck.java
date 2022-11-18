package com.headfirst.strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a RubberDuck");
    }
}
