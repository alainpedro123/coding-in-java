// ******************* FUNCTION BASED SOLUTION *******************

package com.alainafonso;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = {2,1,1,2,3,5,1,2,4};
        String string = "a green apple";

        System.out.println(firstRecurringNumber(array));
        System.out.println(firstRecurringCharacter(string));
    }

    static int firstRecurringNumber(int[] array){
        var set = new HashSet<Integer>();
        for(int i = 0; i < array.length; i++) {
            if (set.contains(array[i]))
                return array[i];
            set.add(array[i]);
        }
        return Integer.MIN_VALUE; // Return none - null
    }

    static char firstRecurringCharacter(String string){
        char[] array = string.toCharArray();
        var set = new HashSet<Character>();
        for(int i = 0; i < array.length; i++) {
            if (set.contains(array[i]))
                return array[i];
            set.add(array[i]);
        }
        return Character.MIN_VALUE; // Return none - null
    }
}



// ******************* CLASS BASED SOLUTION *******************

// MAIN

package com.alainafonso;

public class Main {

    public static void main(String[] args) {

       var finder = new CharFinder();
       var string = finder.firstRepeatingCharacter("a green apple");
        System.out.println(string);
    }
}

// CHARACTER FINDER

package com.alainafonso;

import java.util.HashSet;
import java.util.Set;

public class CharFinder {

    public char firstRepeatingCharacter(String string){
        Set<Character> set = new HashSet<>();

        var characterArray = string.toCharArray();
        for (var character : characterArray) {
            if(set.contains(character))
                return character;

            set.add(character);
        }

        return Character.MIN_VALUE;  // Return none - Null
    }
}