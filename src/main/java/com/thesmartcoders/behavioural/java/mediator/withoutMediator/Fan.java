package com.thesmartcoders.behavioural.java.mediator.withoutMediator;

public class Fan {

    private PowerSupply powerSupply;
    public boolean isOn = false;

    public Fan(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void turnOn(){
        System.out.println("Turning on the fan");
        powerSupply.turnON();
        isOn = true;
    }

    public void turnOff(){
        System.out.println("Turning off the fan");
        powerSupply.turnOff();
        isOn = false;
    }

}
