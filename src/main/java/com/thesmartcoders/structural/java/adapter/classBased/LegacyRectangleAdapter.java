package com.thesmartcoders.structural.java.adapter.classBased;

import com.thesmartcoders.structural.java.adapter.objectBased.TargetShape;

public class LegacyRectangleAdapter extends LegacyRectangle implements TargetShape {

    LegacyRectangleAdapter(int height, int width){
        super(height, width);
    }

    @Override
    public void display() {
        System.out.println("Height : " + getHeight() + " Width : " + getWidth());
    }
}
