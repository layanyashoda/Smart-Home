package com.layan.smarthome;

// PATTERN: Singleton Pattern
public class SmartHomeHub {
    // Private static instance
    private static SmartHomeHub instance;

    // Private constructor to prevent instantiation
    private SmartHomeHub() {
        System.out.println("SmartHomeHub initialized.");
    }

    // Public static method to get the instance
    public static SmartHomeHub getInstance() {
        if (instance == null) {
            instance = new SmartHomeHub();
        }
        return instance;
    }

    public void connect() {
        System.out.println("SmartHomeHub: Connected to system.");
    }
}
