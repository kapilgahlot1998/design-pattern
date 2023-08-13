package com.thesmartcoders.behavioural.java.chainofresponsibility;

public abstract class AuthenticationProcessor {

    AuthenticationProcessor nextProcessor;


    AuthenticationProcessor(){

    }

    AuthenticationProcessor(AuthenticationProcessor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean authorized(AuthenticationProvider processor);



}
