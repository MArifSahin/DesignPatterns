package com.company.strategy;

public class Context {
    private SortingStrategy strategy;

    public Context(SortingStrategy strategy){
        this.strategy = strategy;
    }

    public int[] executeStrategy(int[] numbers){
        return strategy.sort(numbers);
    }
}
