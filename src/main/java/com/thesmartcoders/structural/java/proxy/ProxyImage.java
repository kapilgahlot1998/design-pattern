package com.thesmartcoders.structural.java.proxy;

public class ProxyImage implements Image {

    private static RealImage realImage;
    private String fileName;


    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void display() {
        if (realImage == null)
            realImage = new RealImage(fileName);
        realImage.display();
    }
}
