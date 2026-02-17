package com.layan.smarthome;

// PATTERN: Command Pattern (Concrete Command)
public class TurnOffTVCommand implements Command {
    private TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
