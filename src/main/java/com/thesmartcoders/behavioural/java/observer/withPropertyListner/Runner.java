package com.thesmartcoders.behavioural.java.observer.withPropertyListner;

public class Runner {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addObserver(new MediaChannel());
        newsAgency.addObserver(new NewsChannel());

        newsAgency.notifyChannels("Follow the smart coders instagram account");
    }
}
