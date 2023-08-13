package com.thesmartcoders.behavioural.java.visitor;

public class Bank extends Client {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }
}
