package com.thesmartcoders.structural.java.facade.LegacyImplementation;

public class Runner {
    public static void main(String[] args) {

        AudioCodec audioCodec = new AudioCodec();
        VideoCodec videoCodec = new VideoCodec();

        String file1 = "song.mp3";
        String file2 = "video.mp4";

        play(file1, audioCodec, videoCodec);
        play(file2, audioCodec, videoCodec);

    }

    static void play(String fileName, AudioCodec audioCodec, VideoCodec videoCodec){
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
