package com.company.mediator;

public class ComponentA {
    private String behaviour = "B";

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
