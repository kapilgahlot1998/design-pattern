package com.thesmartcoders.structural.java.decorator;

public class CheesePizza extends PizzaDecorator{

    private String cheeseType;

    CheesePizza(Pizza pizza, String cheeseType) {
        super(pizza);
        this.cheeseType = cheeseType;
    }

    @Override
    public void createPizza() {
        basePizza.createPizza();
        System.out.println( " with Cheese");
    }
}
