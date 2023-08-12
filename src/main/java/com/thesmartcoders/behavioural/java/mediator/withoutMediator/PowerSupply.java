package com.thesmartcoders.behavioural.java.mediator.withoutMediator;

public class PowerSupply {

    boolean isOn = false;

    public void turnON(){
        System.out.println("Starting power supply");
        isOn = true;
    }

    public void turnOff(){
        System.out.println("Turning off power supply");
        isOn = false;
    }

}
