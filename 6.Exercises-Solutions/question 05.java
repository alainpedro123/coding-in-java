package com.alainafonso;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorialIterative(3));
        System.out.println(factorialIterative(4));
    }

    public static int factorialRecursive(int number){
        if(number == 0 || number == 1)
            return 1;
        if(number == 2)
            return 2;
        return number * factorialRecursive((number - 1) );
    }

    public static int factorialIterative(int number){
        if(number == 0 || number == 1)
            return 1;
        if(number == 2)
            return 2;

        int result = 1;
        for( int i = 2; i <= number; i++)
            result = result * i;
        return result;
    }
}