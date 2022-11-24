package com.designpatterns.template;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter...");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding milk and sugar...");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        answer = scanner.nextLine();
        return answer.startsWith("y");
    }
}
