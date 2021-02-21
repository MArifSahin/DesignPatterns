package com.company.decorator;

public class Decorator extends Component{
    protected Component decoratedComponent;

    public Decorator(Component component){
        this.decoratedComponent = component;
    }

    @Override
    void operation(){
        decoratedComponent.operation();
    }
}
