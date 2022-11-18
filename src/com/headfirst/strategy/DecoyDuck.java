package com.headfirst.strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a DecoyDuck");
    }
}
