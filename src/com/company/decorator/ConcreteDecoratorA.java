package com.company.decorator;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    void operation(){
        decoratedComponent.operation();
        decorationA(decoratedComponent);
    }

    void decorationA(Component decoratedComponent){
        System.out.print("+ decoration A ");
    }
}
