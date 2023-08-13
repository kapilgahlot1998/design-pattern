package com.thesmartcoders.behavioural.java.visitor;

public class Resident extends Client {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitResident(this);
    }
}
