package com.kazinak.Singleton;

/**
 * Created by AnriShitsko on 12.04.2016.
 */
public class Singleton {
    private static Singleton instance;
    private static int count = 0;
    private Singleton(){ count++; }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        System.out.println("Creating Singleton object. Count's object is " + count);
        return instance;
    }
}
