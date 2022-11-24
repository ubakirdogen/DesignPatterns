package com.designpatterns.singleton;

public class SingletonTestDriveThreaded {
    public static void main(String[] args) {
        final DatabaseSingleton[] database = new DatabaseSingleton[2];
        DatabaseSingleton database2;
        new Thread(() -> {
            database[0] = DatabaseSingleton.getInstance();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(database[0] == database[1] ? "Both are referencing to same object" : "Something wrong has happened");
        }).start();
        new Thread(() -> {
            database[1] = DatabaseSingleton.getInstance();
        }).start();
    }
}
