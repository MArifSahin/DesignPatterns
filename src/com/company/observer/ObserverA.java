package com.company.observer;

public class ObserverA extends Observer{

    public ObserverA(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Observer A updated with the current state " + this.subject.getState());
    }
}
