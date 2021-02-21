package com.company.decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args){
        Component component = new ConcreteComponentX();

        Component decoratedWithA = new ConcreteDecoratorA(component);

        Component decoratedWithB = new ConcreteDecoratorB(new ConcreteComponentY());

        Component decoratedWithBandC = new ConcreteDecoratorC(decoratedWithB);

        component.operation();
        System.out.println();
        decoratedWithA.operation();
        System.out.println();
        decoratedWithB.operation();
        System.out.println();
        decoratedWithBandC.operation();

    }
}
