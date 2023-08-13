package com.thesmartcoders.behavioural.java.visitor;

public class MailSenderVisitor implements Visitor {
    @Override
    public void visitBank(Bank bank) {
        System.out.println("Sending mail to bank !!!!");
    }

    @Override
    public void visitResident(Resident resident) {
        System.out.println("Sending mail to resident !!!");
    }
}
