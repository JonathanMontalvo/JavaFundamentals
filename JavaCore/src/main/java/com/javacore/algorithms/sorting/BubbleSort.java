package com.javacore.algorithms.sorting;

public class BubbleSort
{

    public BubbleSort()
    {
    }

    public void bubble(int array[])
    {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < ((array.length - 1) - i); j++) {
                if(array[j]>array[j+1]){
                    int temporal=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temporal;
                }
            }
        }
    }
}
