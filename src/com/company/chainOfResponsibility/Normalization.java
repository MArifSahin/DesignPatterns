package com.company.chainOfResponsibility;

public class Normalization extends Receiver {

    public Normalization(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void receive(String message) {
        if (message.equals("Data  analysis")) {
            System.out.println("Data normalization is done.");
            super.receive(message);
        }
    }
}
