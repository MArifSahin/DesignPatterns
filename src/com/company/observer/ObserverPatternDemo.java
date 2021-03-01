package com.company.observer;

public class ObserverPatternDemo {

    public static void main(String[] args){
        Subject subject = new Subject();

        new ObserverA(subject);
        new ObserverB(subject);
        new ObserverC(subject);

        System.out.println("Change state to first state");
        subject.setState("stateA");

        System.out.println("Change state to B");
        subject.setState("stateB");
    }
}
