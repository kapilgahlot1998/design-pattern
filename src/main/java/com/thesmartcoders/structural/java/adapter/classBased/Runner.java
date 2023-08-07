package com.thesmartcoders.structural.java.adapter.classBased;


import com.thesmartcoders.structural.java.adapter.objectBased.TargetShape;

public class Runner {

    public static void main(String[] args) {
        TargetShape newRectangle = new LegacyRectangleAdapter(10, 20);
        newRectangle.display();
    }
}
