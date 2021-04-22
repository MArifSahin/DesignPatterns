package com.company.chainOfResponsibility;

public class ChainConfigurer {
    Receiver chain;

    public ChainConfigurer(){
        this.chain = new Normalization(new FeatureSelection(new AlgorithmSelection(null)));
    }

    public void handle(String message){
        chain.receive(message);
    }
}
