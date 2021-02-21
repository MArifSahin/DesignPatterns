package com.company.state;

public class StateB extends State {
    @Override
    void handle(Context context){
        System.out.println("Change state to state B");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "State B";
    }
}
