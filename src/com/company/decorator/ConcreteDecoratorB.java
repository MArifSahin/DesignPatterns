package com.company.decorator;

public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    void operation(){
        decoratedComponent.operation();
        decorationA(decoratedComponent);
    }

    void decorationA(Component decoratedComponent){
        System.out.print("+ decoration B ");
    }
}