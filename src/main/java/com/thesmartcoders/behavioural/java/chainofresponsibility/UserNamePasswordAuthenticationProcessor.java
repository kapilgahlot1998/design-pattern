package com.thesmartcoders.behavioural.java.chainofresponsibility;

public class UserNamePasswordAuthenticationProcessor extends AuthenticationProcessor {

    UserNamePasswordAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    UserNamePasswordAuthenticationProcessor(){

    }

    @Override
    public boolean authorized(AuthenticationProvider provider) {
        if(provider instanceof UserNameAuthenticator){
            return true;
        }else if(nextProcessor != null){
            System.out.println("Calling next processor from UserNamePassword Processor");
            return nextProcessor.authorized(provider);
        }
        return false;
    }
}
