package com.thesmartcoders.behavioural.java.observer.withPropertyListner;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NewsAgency {
    private String news;

    private final PropertyChangeSupport support;

    NewsAgency(){
        this.support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener channel){
        this.support.addPropertyChangeListener(channel);
    }

    public void removeObserver(PropertyChangeListener channel){
        this.support.removePropertyChangeListener(channel);
    }

    public void notifyChannels(String news){
        support.firePropertyChange("news", this.news, news);
    }


}
