package com.designpatterns.abstractfactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("A Macintosh button is being painted...");
    }
}
