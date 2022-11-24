package com.designpatterns.abstractfactory;

public class Application {
    private GUIFactory factory;
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createApplication() {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
        button.paint();
        checkbox.paint();
        System.out.println("GUI Application is created!");
    }
}
