package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int [] array = {6,4,11,20,1,7};
        int number = 9;

        System.out.println(matchPair2(array, number));
    }

    // first solution - Big O Notation => O(n^2)
    static boolean matchPair(int [] array, int number){
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array. length; j++)
                if(array[i] + array[j] == number )
                    return true;
        return false;
    }

    // second solution
    // 1) [ 6,4,3,2,1,7 ] - 9 = [3, 5, 6, 2, 8, 2]

    //a) [6, 4, 3, 2, 1, 7] // ARRAY 1
    //b) [3, 5, 6, 2, 8, 2] // ARRAY 2

    // 9

    static boolean matchPair2(int [] array, int number){ // O(N)
        //ArrayList<Integer> array2 = new ArrayList<>();

        int[] array2 = new int[6];

        for(int i = 0; i < array.length; i++){
            array2[i] = array[i] - number;
        }

        for(int i = 0; i < array2.length; i++){
            if(array2[i] == array[i]) {
                return true;
            }
        }
    return false;
    }

}

