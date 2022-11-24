package com.designpatterns.abstractfactory;

public class MacCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("A Macintosh checkbox is being painted...");
    }
}
