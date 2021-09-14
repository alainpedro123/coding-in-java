// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        char mostRepeatedChar = StringManipulation.mostRepeatedChar("Heeeellooo!!");
        System.out.println(mostRepeatedChar);
    }
}


// MOST REPEATED CHARACTER
package com.alainafonso;

import java.util.Map;
import java.util.HashMap;

// SOLUTION 1
public class StringManipulation {
    public static char mostRepeatedChar(String string){
        Map<Character, Integer> map = new HashMap<>();
        for(var letter : string.toCharArray())
            if(map.containsKey(letter))
                map.replace(letter, map.get(letter)+1);
            else
                map.put(letter, 1);

        int max = 0;
        for(var value : map.values())
            if(value > max)
                max = value;

        for(var letter : map.keySet())
            if(map.get(letter) == max)
                return letter;

       return Character.MIN_VALUE;
    }

// SOLUTION 2

public static char mostRepeatedChar(String str) {
    if (str == null || str.isEmpty())
      throw new IllegalArgumentException();

    final int ASCII_SIZE = 256;
    int[] frequencies = new int[ASCII_SIZE];
    for (var ch : str.toCharArray())
      frequencies[ch]++;

    int max = 0;
    char result = ' ';
    for (var i = 0; i < frequencies.length; i++)
      if (frequencies[i] > max) {
        max = frequencies[i];
        result = (char) i;
      }

    return result;
  }
}