package com.thesmartcoders.behavioural.java.observer.standard;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private final List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel){
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel){
        this.channels.remove(channel);
    }

    public void notifyChannels(String news){
        this.news = news;
        channels.forEach(channel -> channel.update(news));
    }

}
