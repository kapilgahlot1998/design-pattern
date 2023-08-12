package com.thesmartcoders.behavioural.java.memento;

public class Runner {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("This is First Line \n");
        textEditor.write("Hi Kapil from the TheSmartCoders academy\n");
        textEditor.save();
        System.out.println(textEditor.show());
        textEditor.write("Follow @thesmartcoders on the instagram\n");
        textEditor.undo();
        System.out.println(textEditor.show());
//        textEditor.save();

    }
}
