package com.company.strategy;

public class SelectionSort implements SortingStrategy{
    @Override
    public int[] sort(int[] numbers) {
        int n = numbers.length;

        // One by one move boundary of unsorted subnumbersay
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted numbersay
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }
}
