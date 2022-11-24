package com.designpatterns.command;

public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("The " + name + " light has been turned on");
    }

    public void off() {
        System.out.println("The " + name + " light has been turned off");
    }
}
