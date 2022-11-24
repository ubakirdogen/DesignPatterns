package com.designpatterns.command;

public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void setRadio() {
        System.out.println("Radio Tuner of " + name + "'s stereo has been set");
    }

    public void setCd() {
        System.out.println("CD player of " + name + "'s stereo has been set");
    }

    public void on() {
        System.out.println("The " + name + " stereo has been turned on");
    }

    public void off() {
        System.out.println("The " + name + " stereo has been turned off");
    }


}
