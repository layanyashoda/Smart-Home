package com.layan.smarthome;

// PRINCIPLE: Single Responsibility Principle (SRP)
// Handles scheduling logic separate from the Light hardware class
public class LightScheduler {
    public void scheduleLightTurnOn(Light light, String time) {
        System.out.println("LightScheduler: Scheduling Light '" + light.getName() + "' to turn ON at " + time);
    }
}
