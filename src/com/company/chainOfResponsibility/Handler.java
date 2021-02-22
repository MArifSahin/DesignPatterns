package com.company.chainOfResponsibility;

public class Handler {
    private Handler handler;

    public Handler(Handler handler){
        this.handler = handler;
    }

    public void handle(char message){
        if(handler != null){
            handler.handle(message);
        }
    }
}
