package com.thesmartcoders.behavioural.java.mediator.withMediator;

public class Runner {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Fan fan = new Fan(mediator);
        Button button = new Button(mediator);
        PowerSupply powerSupply = new PowerSupply();

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupply(powerSupply);

        mediator.press();
        System.out.println("//////////////");
        mediator.press();
    }
}
