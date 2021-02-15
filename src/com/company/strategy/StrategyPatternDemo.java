package com.company.strategy;

import java.util.Arrays;

public class StrategyPatternDemo {

    public static void main(String[] args){
        int[] numbers = {25,18,50,14,9,3,19,45,2,7,13};

        Context context = new Context(new InsertionSort());
        System.out.print("Insertion Sort: ");
        System.out.println(Arrays.toString(context.executeStrategy(numbers)));

        context = new Context(new SelectionSort());
        System.out.print("Selection Sort: ");
        System.out.println(Arrays.toString(context.executeStrategy(numbers)));

        context = new Context(new BubbleSort());
        System.out.print("Bubble Sort: ");
        System.out.println(Arrays.toString(context.executeStrategy(numbers)));
    }
}
