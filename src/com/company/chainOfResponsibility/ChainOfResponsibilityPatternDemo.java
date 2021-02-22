package com.company.chainOfResponsibility;

public class ChainOfResponsibilityPatternDemo {

    public static  void  main(String[] args){
        ChainConfigurer chain = new ChainConfigurer();

        chain.handle('A');
        chain.handle('C');
        chain.handle('B');
    }

}
