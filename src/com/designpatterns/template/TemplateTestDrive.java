package com.designpatterns.template;

public class TemplateTestDrive {
    public static void main(String[] args) {
        CaffeineBeverageWithHook coffee = new CoffeeWithHook();
        CaffeineBeverageWithHook tea = new TeaWithHook();
        coffee.prepareRecipe();
        System.out.println("******");
        tea.prepareRecipe();

    }
}
