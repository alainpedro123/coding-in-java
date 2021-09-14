// MAIN CLASS

package com.alainafonso;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = { 7, 3, 1, 4, 6, 2, 3 };
        var sorter = new QuickSort();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}


// QUICKSORT CLASS

package com.alainafonso;

public class QuickSort {
    // 4) sort - final
    public void sort(int[] array){
        sort(array, 0, array.length-1);
    }

    // 3) sort 3 parameters;
    private void sort(int[] array, int start, int end){
        if(start >= end)    // checking if the array is empty (start>end) or has only one item (start==end)
            return;

        var boundary = partition(array, start, end);
        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);
    }

    // 2) Partition
    private  int partition(int[] array, int start, int end){
        var pivot = array[end];
        var boundary = start - 1;   // left side

        for(var i = start; i <= end; i++)
            if(pivot >= array[i])
                swap(array, i, ++boundary);

        return boundary;    // the index of the pivot
    }

    // 1) Swap
    private void swap(int[] array, int index1, int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}