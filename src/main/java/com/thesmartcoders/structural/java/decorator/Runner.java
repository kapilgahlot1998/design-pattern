package com.thesmartcoders.structural.java.decorator;

public class Runner {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        //Please decorate pizza
        Pizza cheesePizza = new CheesePizza(pizza, "AMUL");
        cheesePizza.createPizza();
    }
}
