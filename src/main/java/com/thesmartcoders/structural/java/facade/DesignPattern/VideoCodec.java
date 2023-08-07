package com.thesmartcoders.structural.java.facade.DesignPattern;

public class VideoCodec implements Codec {

    @Override
    public void decode(String fileName) {
        System.out.println("Decoding file : " + fileName);
    }

}
