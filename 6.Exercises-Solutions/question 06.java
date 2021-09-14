package com.alainafonso;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacciIterative(7));
    }

    public static int fibonacciRecursive(int index){
        if(index == 0)
            return 0;

        if(index == 1 || index == 2)
            return 1;

        return fibonacciRecursive((index - 2)) + fibonacciRecursive((index - 1));
    }

    public static int fibonacciIterative(int index){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0); array.add(1);

        if(index == 0)
            array.get(index);

        if(index == 1)
            array.get(index);
        
        for(int i = 1; i <= index; i++)
            array.add(array.get(i) + array.get(i - 1));

        return array.get(index);
    }
}