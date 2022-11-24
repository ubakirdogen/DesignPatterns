package com.designpatterns.facade;

public class FacadeTestDrive {
    public static void main(String[] args) {
        ComplexSubsystem1 cs1 = new ComplexSubsystem1();
        ComplexSubsystem2 cs2 = new ComplexSubsystem2();
        ComplexSubsystem3 cs3 = new ComplexSubsystem3();
        Facade facade = new Facade(cs1, cs2, cs3);

        facade.doActionOnComplexSubsystems();
    }
}
