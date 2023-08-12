package com.thesmartcoders.behavioural.java.mediator.withMediator;

public class Mediator {

    private Fan fan;
    private Button button;
    private PowerSupply powerSupply;

    public Mediator() {
    }

    public void press(){
        System.out.println("Button Presses !!");
        if(fan.isOn){
            fan.turnOff();
        }else
            fan.turnOn();
    }

    public void start(){
        System.out.println("Starting the power supply");
        powerSupply.turnOn();
    }

    public void stop(){
        System.out.println("Stopping the power supply");
        powerSupply.turnOff();
    }


    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }
}


