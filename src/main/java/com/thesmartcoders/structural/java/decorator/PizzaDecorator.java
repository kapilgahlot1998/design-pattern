package com.thesmartcoders.structural.java.decorator;

public abstract class PizzaDecorator implements Pizza{

    Pizza basePizza;

    PizzaDecorator(Pizza basePizza){
        this.basePizza = basePizza;
    }

}
