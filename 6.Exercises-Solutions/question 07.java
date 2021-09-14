package com.alainafonso;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'i'};
        System.out.println(commonItems(array1,array2));
    }

    public static boolean commonItems(char[] array1, char[] array2){ // O(n)
        Map<Character,String> map = new HashMap<>();
        for(int i = 0; i < array1.length; i++)
            if(!map.containsKey(array1[i]))
                map.put(array1[i], "true");
        //System.out.println(map);

        for(int i = 0; i < array2.length; i++)
            if(map.containsKey(array2[i]))
                return true;
        return false;
    }
}