package com.company.observer;

public class ObserverB extends Observer{

    public ObserverB(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Observer B updated with the current state " + this.subject.getState());
    }
}
