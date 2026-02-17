package com.layan.smarthome;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Smart Home Automation System Started ===\n");

        // 1. Singleton Pattern Usage
        SmartHomeHub hub = SmartHomeHub.getInstance();
        hub.connect();

        // Show that another instance returns the same object (conceptually, though we
        // won't print object hash here for simplicity unless requested)
        SmartHomeHub hub2 = SmartHomeHub.getInstance();
        if (hub == hub2) {
            // Hub singleton verified
        }
        System.out.println();

        // Initialize Devices
        Light livingRoomLight = new Light("L001", "Living Room Light");
        TV livingRoomTV = new TV("T001", "Living Room TV");

        // 2. Command Pattern Usage
        Command turnOnLight = new TurnOnLightCommand(livingRoomLight);
        Command turnOffTV = new TurnOffTVCommand(livingRoomTV);

        RemoteControl remote = new RemoteControl();

        // Turn on light
        remote.setCommand(turnOnLight);
        remote.pressButton();

        // Turn off TV
        remote.setCommand(turnOffTV);
        remote.pressButton();
        System.out.println();

        // 3. Facade Pattern Usage
        SmartHomeFacade homeFacade = new SmartHomeFacade(livingRoomLight, livingRoomTV);
        homeFacade.watchMovieMode();
        System.out.println();

        // 4. SOLID (SRP) Usage
        LightScheduler scheduler = new LightScheduler();
        scheduler.scheduleLightTurnOn(livingRoomLight, "20:00");

        System.out.println("\n=== System Finished ===");
    }
}
