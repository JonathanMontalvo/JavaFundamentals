package com.javacore.algorithms.sorting;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    // Helper function to print the array
    public static void printArray(int[] array)
    {
        System.out.print("[");
        if (array.length > 0) {
            System.out.print(array[0]);
            for (int i = 1; i < array.length; i++) {
                System.out.print(", " + array[i]);
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            int[] array = {45, 36, 33, 13, 9, 17, 5, 3, 28, 19};
            option = -1;
            System.out.println("\n---Select an option---");
            System.out.println("0.- Exit");
            System.out.println("1.- Bubble Sort");
            System.out.println("2.- Quick Sort");
            System.out.println("3.- Merge Sort");
            System.out.println("4.- Selection Sort");
            System.out.println("5.- Insertion Sort");
            System.out.println("6.- Heap Sort");
            System.out.println("7.- Radix Sort");
            System.out.println("8.- Counting Sort");
            System.out.println("9.- Bucket Sort");
            System.out.println("10.- Tim Sort");
            try {
                option = sc.nextInt();
            } catch (InputMismatchException iME) {
                System.out.println("Use integer numbers");

                //Clean the buffer
                sc.nextLine();
                continue;
            } finally {
                if (option == 0) {
                    System.out.println("Bye Bye");
                    continue;
                }
            }

            System.out.println("Original array:");
            printArray(array);

            switch (option) {
                case 1:
                    BubbleSort bubbleSort = new BubbleSort();
                    bubbleSort.bubble(array);
                    break;
                case 2:
                    QuickSort quickSort = new QuickSort();
                    quickSort.quickSort(array, 0, array.length-1);
                    break;
                case 3:
                    MergeSort mergeSort = new MergeSort();
                    mergeSort.mergeSort(array, 0, array.length - 1);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            System.out.println("Sorted array:");
            printArray(array);
        } while (option != 0);
    }
}
