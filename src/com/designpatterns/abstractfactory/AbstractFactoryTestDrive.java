package com.designpatterns.abstractfactory;

public class AbstractFactoryTestDrive {
	
	// comment
    public static void main(String[] args) {
        Application winApplication = new Application(new WinGUIFactory());
        winApplication.createApplication();
        System.out.println("*********");
        Application macApplication = new Application(new MacGUIFactory());
        macApplication.createApplication();
    }

}
