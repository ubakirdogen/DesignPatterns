package com.designpatterns.template;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiment();
        }
    }

    public abstract void brew();

    public abstract void addCondiment();

    public boolean customerWantsCondiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    public void boilWater() {
        System.out.println("Boiling water...");
    }
}
