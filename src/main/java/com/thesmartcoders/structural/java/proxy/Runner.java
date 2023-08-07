package com.thesmartcoders.structural.java.proxy;

public class Runner {

    public static void main(String[] args) {
        Image image = new ProxyImage("Kapil.txt");
        image.display();
        image.display();
    }
}
