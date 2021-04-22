package com.company.chainOfResponsibility;

public class FeatureSelection extends Receiver {

    public FeatureSelection(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void receive(String message) {
        if (message.equals("Data  analysis")) {
            System.out.println("Feature selection is done.");
            super.receive(message);
        }
    }
}
