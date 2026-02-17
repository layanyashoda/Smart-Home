# Smart Home Automation System

A simple Java-based Smart Home Automation System designed to demonstrate key Design Patterns and Object-Oriented Principles. This project simulates a smart home hub controlling devices like Lights and TVs.

## Features & Design Patterns

This project implements the following patterns as per assignment requirements:

-   **Singleton Pattern**: Used in `SmartHomeHub` to ensure a single point of access to the system connection.
-   **Command Pattern**: Used to encapsulate requests.
    -   `Command` interface.
    -   `TurnOnLightCommand`, `TurnOffTVCommand` (Concrete Commands).
    -   `RemoteControl` (Invoker).
-   **Facade Pattern**: `SmartHomeFacade` simplifies complex operations like "Movie Mode" (which triggers multiple devices).
-   **SOLID Principles (SRP)**: `LightScheduler` handles timing logic separate from the `Light` device logic.
-   **OO Concepts**: Demonstrates Encapsulation, Inheritance (`SmartDevice`), and Polymorphism.

## Requirements

-   Java Development Kit (JDK) 8 or higher.
-   Maven (for building and project management).

## How to Run

### Using Command Line (Maven)

1.  **Build the project**:
    ```sh
    mvn clean package
    ```

2.  **Run the application**:
    ```sh
    mvn exec:java -Dexec.mainClass="com.layan.smarthome.Main"
    ```

### Using NetBeans (or other IDEs)

1.  Open NetBeans.
2.  Select **File > Open Project**.
3.  Navigate to the `smarthome` folder.
4.  Run the project (Right-click project > Run).

## Project Structure

```
src/main/java/com/layan/smarthome/
├── Command.java            // Command Interface
├── Light.java              // Concrete SmartDevice
├── LightScheduler.java     // SRP Example
├── Main.java               // Entry Point
├── RemoteControl.java      // Invoker
├── SmartDevice.java        // Abstract Base Class
├── SmartHomeFacade.java    // Facade Pattern
├── SmartHomeHub.java       // Singleton Pattern
├── TurnOffTVCommand.java   // Concrete Command
├── TurnOnLightCommand.java // Concrete Command
└── TV.java                 // Concrete SmartDevice
```

## Author
[Layan Yasoda / UWU/ICT/21/081]
