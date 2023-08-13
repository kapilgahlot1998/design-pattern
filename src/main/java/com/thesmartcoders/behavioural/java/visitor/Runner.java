package com.thesmartcoders.behavioural.java.visitor;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Client> clients = Arrays.asList(new Bank(), new Resident());
        Visitor visitor = new MailSenderVisitor();
        clients.forEach(client -> client.accept(visitor));
    }
}
