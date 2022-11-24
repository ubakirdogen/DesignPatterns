package com.designpatterns.strategy;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I squeak...");
    }
}
