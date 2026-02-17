package com.layan.smarthome;

// PATTERN: Facade Pattern
public class SmartHomeFacade {
    private Light light;
    private TV tv;

    public SmartHomeFacade(Light light, TV tv) {
        this.light = light;
        this.tv = tv;
    }

    // Simplifies complex operation (Movie Mode)
    public void watchMovieMode() {
        System.out.println("SmartHomeFacade: ACTIVATE MOVIE MODE");
        System.out.println("-------------------------------------");
        // Dimming lights (simulating by turning off for now as we have simple logic) or turning on specific mood lighting
        System.out.println("Facade: Preparing lights...");
        light.turnOn(); 
        System.out.println("Facade: Preparing TV...");
        tv.turnOn(); 
        System.out.println("-------------------------------------");
    }
}
