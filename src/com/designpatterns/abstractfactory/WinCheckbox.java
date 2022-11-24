package com.designpatterns.abstractfactory;

public class WinCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("A Windows checkbox is being painted...");
    }
}
