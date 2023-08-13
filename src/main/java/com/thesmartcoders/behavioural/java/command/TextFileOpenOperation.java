package com.thesmartcoders.behavioural.java.command;

public class TextFileOpenOperation implements TextFileOperations {

    private final TextFile textFile;

    TextFileOpenOperation(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.open();
    }
}
