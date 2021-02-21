package com.company.decorator;

public class ConcreteDecoratorC extends Decorator{

    public ConcreteDecoratorC(Component component) {
        super(component);
    }

    @Override
    void operation(){
        decoratedComponent.operation();
        decorationA(decoratedComponent);
    }

    void decorationA(Component decoratedComponent){
        System.out.print("+ decoration C ");
    }
}