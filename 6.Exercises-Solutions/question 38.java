package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        int [] numbers = {2, 3, 17, -2, 10, 5, 1, 4};
        int max = max(numbers);
        int min = min(numbers);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static int max(int[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++)
            if(array[i] > max)
                max = array[i];
        return max;
    }

    public static int min(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++)
            if(array[i] < min)
                min = array[i];
        return min;
    }
}