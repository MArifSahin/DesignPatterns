//Concrete strategy 2
package com.company.strategy;

public class InsertionSort implements SortingStrategy {
    @Override
    public int[] sort(int[] numbers) {
        int length = numbers.length;

        for (int i = 1; i < length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        return numbers;
    }
}
