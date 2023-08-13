package com.thesmartcoders.behavioural.java.strategy;

public class PaymentClient {

    PaymentStrategy paymentStrategy;

    PaymentClient(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    String processPayment(double amount) {
        paymentStrategy.pay(amount);
        return "Payment done of amount " + amount;
    }

}
