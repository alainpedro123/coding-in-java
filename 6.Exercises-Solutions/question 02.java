package com.alainafonso;

import java.util.Scanner;

// SOLUTION 1
public class Main {

    public static void main(String[] args) {
      evenNumbers(10);
    }

    static void oddNumbers(int n){
        for(int i = 0; i < n; i++)
            if(i % 2 !=0 )
                System.out.println(i);
    }

    static void evenNumbers(int n){
        for(int i = 0; i < n; i++)
            if(i % 2 == 0)
                System.out.println(i);
    }
}


// SOLUTION 2
public class Main {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int number = input.nextByte();

        for(int i = 0; i <= number; i++)
            if(i % 2 != 0)
                System.out.println(i);

        System.out.print("Enter an even number: ");
        int number2 = input.nextByte();

        for(int i = 0; i <= number2; i++)
            if(i % 2 == 0)
                System.out.println(i);
    }
}


// SOLUTION 3

public class Main {

    public static void main(String[] args) {
        var numbers = new OddNumber(10);
        numbers.printNumber();

        var numbers2 = new evenNumber(10);
        numbers2.printEvenNumbers();
    }
}


public class OddNumber {
    int limit;

    public OddNumber(int limit){
        this.limit = limit;
    }

    public void printNumber(){
        for(int i = 0; i <= limit; i++)
            if(i%2 != 0)
                System.out.println(i);
    }
}

public class evenNumber {
    private int limit;

   public evenNumber(int limit){
       this.limit = limit;
   }

   public void printEvenNumbers(){
       for(int i = 0; i <= limit; i++)
           if(i % 2 == 0)
               System.out.println(i);
   }
}
