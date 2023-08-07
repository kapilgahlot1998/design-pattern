package com.thesmartcoders.structural.java.facade.DesignPattern;

public class PlayerFacade {

    private AudioCodec audioCodec = new AudioCodec();
    private VideoCodec videoCodec = new VideoCodec();

    void play(String fileName){
        FileOpener fileOpener = new FileOpener();
        if(fileName.endsWith(".mp3")){
            audioCodec.decode(fileName);
            fileOpener.openFile(fileName);
        } else if(fileName.endsWith(".mp4")){
            videoCodec.decode(fileName);
            fileOpener.openFile(fileName);
        } else {
            throw new RuntimeException("Un Supported file");
        }
    }

}
