package com.thesmartcoders.structural.java.adapter.objectBased;

public class Runner {
    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle(10, 20);
        TargetShape newRectangleAdapter = new LegacyRectangleAdapter(legacyRectangle);
        newRectangleAdapter.display();
    }
}
