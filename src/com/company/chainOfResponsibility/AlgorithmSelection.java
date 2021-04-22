package com.company.chainOfResponsibility;

public class AlgorithmSelection extends Receiver {

    public AlgorithmSelection(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void receive(String message) {
        if (message.equals("Data  analysis")) {
            System.out.println("Algorithm selection is done.");
            super.receive(message);
        }
    }
}
