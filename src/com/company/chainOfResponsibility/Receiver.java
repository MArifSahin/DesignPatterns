package com.company.chainOfResponsibility;

public class Receiver {
    private Receiver receiver;

    public Receiver(Receiver receiver){
        this.receiver = receiver;
    }

    public void receive(String message){
        if(receiver != null){
            receiver.receive(message);
        }
    }
}
