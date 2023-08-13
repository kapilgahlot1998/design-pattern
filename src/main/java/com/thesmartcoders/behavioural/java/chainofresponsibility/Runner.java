package com.thesmartcoders.behavioural.java.chainofresponsibility;

public class Runner {
    public static void main(String[] args) {
        AuthenticationProcessor processor = new UserNamePasswordAuthenticationProcessor(new OauthProcessor());
        System.out.println(processor.authorized(new OauthProvider()));

    }
}

