package com.designpatterns.singleton;


public class DatabaseSingleton {
    private static DatabaseSingleton instance = null;

    private DatabaseSingleton() {
        System.out.println("Singleton Database object has been created");
    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            synchronized (DatabaseSingleton.class) {
                if (instance == null) {
                    instance = new DatabaseSingleton();
                }
            }
        }
        return instance;
    }
}
