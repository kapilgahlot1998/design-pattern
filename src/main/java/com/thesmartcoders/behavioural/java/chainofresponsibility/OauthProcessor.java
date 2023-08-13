package com.thesmartcoders.behavioural.java.chainofresponsibility;

public class OauthProcessor extends AuthenticationProcessor {

    public OauthProcessor(AuthenticationProcessor processor) {
        super(processor);
    }

    public OauthProcessor(){

    }

    @Override
    public boolean authorized(AuthenticationProvider provider) {
        if(provider instanceof OauthProvider){
            return true;
        }else if(nextProcessor != null){
            System.out.println("Calling next processor from Oauth Processor");
            return nextProcessor.authorized(provider);
        }
        return false;
    }
}
