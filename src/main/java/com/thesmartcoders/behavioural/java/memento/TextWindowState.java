package com.thesmartcoders.behavioural.java.memento;

public class TextWindowState {

    private String savedText;

    TextWindowState(String textToBeSaved){
        this.savedText = textToBeSaved;
    }

    public String getSavedText() {
        return savedText;
    }
}
