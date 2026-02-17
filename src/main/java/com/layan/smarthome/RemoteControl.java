package com.layan.smarthome;

// PATTERN: Command Pattern (Invoker)
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        System.out.println("Remote Control: Button pressed.");
        command.execute();
    }
}
