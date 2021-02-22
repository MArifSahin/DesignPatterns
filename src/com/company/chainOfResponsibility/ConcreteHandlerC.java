package com.company.chainOfResponsibility;

public class ConcreteHandlerC extends Handler {

    public ConcreteHandlerC(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(char message) {
        if (message == 'C') {
            System.out.println("Handle C");
        } else {
            super.handle(message);
        }
    }
}
