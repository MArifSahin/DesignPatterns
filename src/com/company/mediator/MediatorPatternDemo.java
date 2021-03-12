package com.company.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ComponentA componentA = new ComponentA();
        ComponentB componentB = new ComponentB();

        Mediator mediator = new Mediator();

        mediator.setA(componentA);
        mediator.setB(componentB);

        Mediator.componentA.coordinatedBehaviour("clickA");
        Mediator.componentB.coordinatedBehaviour("clickB");

        System.out.println(Mediator.componentA.getBehaviour());
        System.out.println(Mediator.componentB.getBehaviour());
    }
}
