package com.company.chainOfResponsibility;

public class ConcreteHandlerA extends Handler {

    public ConcreteHandlerA(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(char message) {
        if (message == 'A') {
            System.out.println("Handle A");
        } else {
            super.handle(message);
        }
    }
}
