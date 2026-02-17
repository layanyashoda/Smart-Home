package com.layan.smarthome;

public class Light extends SmartDevice {

    public Light(String id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        System.out.println("Light '" + getName() + "' is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light '" + getName() + "' is OFF.");
    }
}
