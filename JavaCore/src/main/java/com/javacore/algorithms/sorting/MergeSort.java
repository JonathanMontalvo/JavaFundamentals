package com.javacore.algorithms.sorting;

public class MergeSort
{

    public MergeSort()
    {
    }

    // Main mergeSort function that takes the array, left index(0), and right index(array.length-1)
    public void mergeSort(int[] array, int left, int right)
    {
        if (left < right) {
            // Find the middle index
            //Java rounds down if the result is a decimal.
            int mid = (left + right) / 2;

            // Recursively sort the left half
            mergeSort(array, left, mid);

            // Recursively sort the right half
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Merges two sorted halves of the array into one sorted array
    private void merge(int[] array, int left, int mid, int right)
    {
        // Calculate the sizes of the two sub-arrays
        int n1 = mid - left + 1;  // Size of the left sub-array
        int n2 = right - mid;     // Size of the right sub-array

        // Create temporary arrays for the left and right halves
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy the data into temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copy any remaining elements of leftArray[] (if any)
        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        // Copy any remaining elements of rightArray[] (if any)
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }
}
