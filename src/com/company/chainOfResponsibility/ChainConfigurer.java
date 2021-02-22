package com.company.chainOfResponsibility;

public class ChainConfigurer {
    Handler chain;

    public ChainConfigurer(){
        this.chain = new ConcreteHandlerA(new ConcreteHandlerB(new ConcreteHandlerC(null)));
    }

    public void handle(char message){
        chain.handle(message);
    }
}
