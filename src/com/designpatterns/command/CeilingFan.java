package com.designpatterns.command;

public class CeilingFan {
    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("The " + name + " ceiling fan has been turned on");
    }

    public void off() {
        System.out.println("The " + name + " ceiling fan has been turned off");
    }
}
