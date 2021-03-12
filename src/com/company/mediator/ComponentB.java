package com.company.mediator;

public class ComponentB {
    private String behaviour = "A";

    public void setBehaviour(String behaviour){
        this.behaviour += behaviour;
    }

    public String getBehaviour(){
        return this.behaviour;
    }

    public void coordinatedBehaviour(String message){
        Mediator.notify(this, message);
    }
}
