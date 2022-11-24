package com.designpatterns.facade;

public class Facade {
    ComplexSubsystem1 cs1;
    ComplexSubsystem2 cs2;
    ComplexSubsystem3 cs3;

    public Facade(ComplexSubsystem1 cs1, ComplexSubsystem2 cs2, ComplexSubsystem3 cs3) {
        this.cs1 = cs1;
        this.cs2 = cs2;
        this.cs3 = cs3;
    }

    public void doActionOnComplexSubsystems() {
        cs1.someFunction();
        cs2.someOtherFunction();
        cs3.OtherFunction();
    }
}
