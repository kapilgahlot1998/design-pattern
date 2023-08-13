package com.thesmartcoders.behavioural.java.observer.withPropertyListner;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MediaChannel implements PropertyChangeListener {

    private String news;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.news = String.valueOf(evt.getNewValue());
        System.out.println("News Arrived : "+ news);
    }
}
