package com.company.chainOfResponsibility;

public class ConcreteHandlerB extends Handler {

    public ConcreteHandlerB(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(char message) {
        if (message == 'B') {
            System.out.println("Handle B");
        } else {
            super.handle(message);
        }
    }
}
