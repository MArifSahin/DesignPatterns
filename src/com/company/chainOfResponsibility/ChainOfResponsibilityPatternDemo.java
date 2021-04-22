package com.company.chainOfResponsibility;

public class ChainOfResponsibilityPatternDemo {
    public static  void  main(String[] args){
        ChainConfigurer chain = new ChainConfigurer();
        chain.handle("Data  analysis");
    }
}
