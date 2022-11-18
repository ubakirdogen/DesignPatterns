package com.headfirst.strategy;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Just a regular duck quack");
    }
}
