package com.headfirst.strategy;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a RedheadDuck");
    }
}
