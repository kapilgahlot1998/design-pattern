package com.thesmartcoders.structural.java.decorator;

public class BasicPizza implements Pizza {
    @Override
    public void createPizza() {
        System.out.println("Basic Pizza");
    }
}
