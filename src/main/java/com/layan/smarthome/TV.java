package com.layan.smarthome;

public class TV extends SmartDevice {

    public TV(String id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        System.out.println("TV '" + getName() + "' is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV '" + getName() + "' is OFF.");
    }
}
