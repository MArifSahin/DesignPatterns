package com.company.state;

public class StateA extends State {
    @Override
    void handle(Context context){
        System.out.println("Change state to state A");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "State A";
    }
}
