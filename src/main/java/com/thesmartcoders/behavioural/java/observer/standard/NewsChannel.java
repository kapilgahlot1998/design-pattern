package com.thesmartcoders.behavioural.java.observer.standard;

public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("New News arrived at news channel");
    }
}
