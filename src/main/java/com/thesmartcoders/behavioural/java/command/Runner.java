package com.thesmartcoders.behavioural.java.command;

public class Runner {

    public static void main(String[] args) {
        TextFileOperationInvoker textFileOperationInvoker = new TextFileOperationInvoker();

        //Direct object-oriented Approach
        textFileOperationInvoker.execute(new TextFileOpenOperation(new TextFile()));

    }

}
