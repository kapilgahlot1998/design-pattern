package com.thesmartcoders.behavioural.java.mediator.withoutMediator;

public class Runner {
    public static void main(String[] args) {
        Button button = new Button(new Fan(new PowerSupply()));
        button.press();
        System.out.println("//////////////");
        button.press();
    }
}
