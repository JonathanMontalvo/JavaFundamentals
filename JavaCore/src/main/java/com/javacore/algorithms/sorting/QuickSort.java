package com.javacore.algorithms.sorting;

public class QuickSort
{

    public QuickSort()
    {
    }

    // Main quickSort function that takes the array, low index(0), and high index(array.length-1)
    public void quickSort(int[] array, int low, int high)
    {
        if (low < high) {
            // Find the pivot element
            int pivotIndex = partition(array, low, high);

            // Recursively sort the left and right halves
            quickSort(array, low, pivotIndex - 1);  // Sort the left side of the pivot
            quickSort(array, pivotIndex + 1, high); // Sort the right side of the pivot
        }
    }

    // Partition the array around the pivot
    private int partition(int[] array, int low, int high)
    {
        // Choose the right element as the pivot
        int pivot = array[high];
        int i = (low - 1); // Index of the smaller element

        // Traverse the array and move elements smaller than the pivot to the left
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++; // Increment the smaller element index
                swap(array, i, j); // Swap elements
            }
        }

        // Swap the pivot element with the element at i+1 so the pivot is placed correctly
        swap(array, i + 1, high);
        return i + 1; // Return the partition index
    }

    // Swap helper function to swap elements in the array
    private void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
