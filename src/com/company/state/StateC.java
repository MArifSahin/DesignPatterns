package com.company.state;

public class StateC extends State{
    @Override
    void handle(Context context){
        System.out.println("Change state to state C");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "State C";
    }
}
