package com.thesmartcoders.behavioural.java.memento;

public class TextWindow {

    private StringBuilder currentText;

    TextWindow(){
        this.currentText = new StringBuilder();
    }

    public StringBuilder getCurrentText() {
        return currentText;
    }

    public void addText(String newValue){
        currentText.append(newValue);
    }

    public TextWindowState save(){
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState textWindowState){
        this.currentText = new StringBuilder(textWindowState.getSavedText());
    }


}
