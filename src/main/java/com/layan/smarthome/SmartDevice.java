package com.layan.smarthome;

// PRINCIPLE: Inheritance (Base class for all smart devices)
// PRINCIPLE: Encapsulation (Private fields with public getters/setters)
public abstract class SmartDevice {
    private String id;
    private String name;

    public SmartDevice(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
