package com.company.observer;

public class Observer {

    protected Subject subject;

    public void update() {
        System.out.println("Default observer update");
    }

}
