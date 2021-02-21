package com.company.state;

public class StatePatternDemo {

    public static  void  main(String[] args){
        Context context = new Context();
        System.out.println(context.toString());

        StateB stateB = new StateB();
        stateB.handle(context);
        System.out.println(context.toString());

        StateA stateA = new StateA();
        stateA.handle(context);
        System.out.println(context.toString());

        StateC stateC = new StateC();
        stateC.handle(context);
        System.out.println(context.toString());


    }
}
