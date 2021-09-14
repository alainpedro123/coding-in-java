package com.alainafonso;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = new int[100];
        Arrays.fill(array, 1);

        for (int number : array)
            if(number == 1)
               number++;

        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)/1000);
    }
}

// Not working as intended