package com.designpatterns.singleton;

public class SingletonTestDrive {
    public static void main(String[] args) {
        DatabaseSingleton database1 = DatabaseSingleton.getInstance();
        DatabaseSingleton database2 = DatabaseSingleton.getInstance();

        System.out.println(database1 == database2 ? "database1 and database2 are same instances" : "this is not a correct singleton implementation");
    }
}
