package com.designpatterns.facade;

import java.lang.reflect.Method;

public class ComplexSubsystem1 {
    void someFunction() {
        Method[] methods = this.getClass().getDeclaredMethods();
        String methodName = methods[0].getName();
        String className = this.getClass().getSimpleName();
        System.out.println("\"" + methodName + "\" function of class \"" + className + "\" is called");
    }
}
