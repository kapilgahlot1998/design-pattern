package com.thesmartcoders.behavioural.java.mediator.withMediator;

public class Fan {

    private final Mediator mediator;
    boolean isOn = false;

    public Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    public void turnOff(){
        System.out.println("Turning off the fan");
        mediator.stop();
        isOn = false;
    }

    public void turnOn(){
        System.out.println("Turning on the fan");
        mediator.start();
        isOn = true;
    }

}
