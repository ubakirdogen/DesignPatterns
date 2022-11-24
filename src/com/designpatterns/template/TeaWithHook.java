package com.designpatterns.template;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Steeping the tea...");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding lemon...");
    }
}
