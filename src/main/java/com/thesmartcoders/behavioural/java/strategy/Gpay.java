package com.thesmartcoders.behavioural.java.strategy;

public class Gpay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Fetching UPI details");
        System.out.println("Paying amount : " + amount);
    }
}
