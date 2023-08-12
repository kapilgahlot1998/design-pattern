package com.thesmartcoders.behavioural.java.memento;

public class TextEditor {

    private final TextWindow textWindow;
    private TextWindowState textWindowState;

    TextEditor(TextWindow textWindow){
        this.textWindow = textWindow;
    }

    public void write(String newText){
        textWindow.addText(newText);
    }

    public String show(){
        return textWindow.getCurrentText().toString();
    }

    public void save(){
        this.textWindowState = textWindow.save();
    }

    public void undo(){
        textWindow.restore(this.textWindowState);
    }

}
