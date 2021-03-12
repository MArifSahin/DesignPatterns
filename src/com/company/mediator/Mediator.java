package com.company.mediator;

import java.util.List;

public class Mediator {

    static ComponentA componentA;
    static ComponentB componentB;

    public void setA(ComponentA componentA){
        Mediator.componentA = componentA;
    }

    public void setB(ComponentB componentB){
        Mediator.componentB = componentB;
    }

    public static void notify(Object object, String message){
        if(object.getClass() == ComponentA.class) componentB.setBehaviour(" effected A->" + message);

        if(object.getClass() == ComponentB.class){
            componentA.setBehaviour(" effected B->" +message);
        }
    }
}
