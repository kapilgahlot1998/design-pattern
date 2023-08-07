package com.thesmartcoders.structural.java.adapter.objectBased;

public class LegacyRectangleAdapter implements TargetShape {

    private LegacyRectangle legacyRectangle;

    LegacyRectangleAdapter(LegacyRectangle legacyRectangle){
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void display() {
        System.out.println("Height : " + legacyRectangle.getHeight() + " Width : " + legacyRectangle.getWidth());
    }
}
