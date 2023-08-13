package com.thesmartcoders.behavioural.java.command;

public class TextFileSaveOperation implements TextFileOperations {

    private final TextFile textFile;

    TextFileSaveOperation(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.save();
    }
}
