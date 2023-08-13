package com.thesmartcoders.behavioural.java.strategy;

public class Runner {
    public static void main(String[] args) {
        PaymentClient paymentClient = new PaymentClient(new Gpay());
        System.out.println(paymentClient.processPayment(300.0));

    }
}
