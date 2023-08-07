package com.thesmartcoders.structural.java.adapter.objectBased;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LegacyRectangle {

    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
