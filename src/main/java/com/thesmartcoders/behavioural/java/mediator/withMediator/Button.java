package com.thesmartcoders.behavioural.java.mediator.withMediator;

public class Button {
    private final Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press(){
        mediator.press();
    }

}
