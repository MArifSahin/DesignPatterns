//Concrete strategy 1
package com.company.strategy;

public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] numbers) {
        boolean swapped;
        int length = numbers.length;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            swapped = false;

            for (int j = 0; j < length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
        return numbers;
    }
}
