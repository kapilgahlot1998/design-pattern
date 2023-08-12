package com.thesmartcoders.behavioural.java.mediator.withoutMediator;

public class Button {

    private Fan fan;

    public Button(Fan fan) {
        this.fan = fan;
    }

    public void press(){
        System.out.println("Button Pressed !!!");
        if(fan.isOn){
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }



}
