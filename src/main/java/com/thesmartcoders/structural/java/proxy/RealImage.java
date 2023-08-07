package com.thesmartcoders.structural.java.proxy;

public class RealImage implements Image {

    private String fileName;

    RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    void loadImageFromDisk(){
        System.out.println("Loading image form the disk : " + fileName);
    }

    @Override
    public void display() {
        System.out.println("display the image " + fileName);
    }
}
