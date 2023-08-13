package com.thesmartcoders.behavioural.java.strategy;

public class CreditCard implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Fetching credit card details");
        System.out.println("Paying amount " + amount );
    }
}
