package com.designpatterns.abstractfactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("A Windows button is being painted...");
    }
}
