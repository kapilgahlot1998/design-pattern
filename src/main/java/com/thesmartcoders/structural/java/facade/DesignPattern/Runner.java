package com.thesmartcoders.structural.java.facade.DesignPattern;


public class Runner {
    public static void main(String[] args) {

        String file1 = "song.mp3";
        String file2 = "video.mp4";

        PlayerFacade playerFacade = new PlayerFacade();
        playerFacade.play(file1);
        playerFacade.play(file2);

    }


}
