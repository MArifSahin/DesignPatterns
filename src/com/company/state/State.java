package com.company.state;

public class State {
    void handle(Context context){
        System.out.println("Change state to default state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Default State";
    }
}
