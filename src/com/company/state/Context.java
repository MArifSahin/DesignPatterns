package com.company.state;

public class Context {
    protected State state;

    public Context() {
        this.state = new State();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Current state: " + state ;
    }
}
