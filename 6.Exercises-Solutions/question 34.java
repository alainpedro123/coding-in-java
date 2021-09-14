// MAIN CLASS
package com.alainafonso;

public class Main {
    public static void main(String[] args) {
        boolean anagrams = StringManipulation.areAnagrams("ABCD", "BDCA");
        System.out.println(anagrams);
    }
}


// ANAGRAMS

package com.alainafonso;

import java.util.Arrays;


public class StringManipulation {
	// SOLUTION 1 - O(n)
	public static boolean areAnagrams(String first, String second){
        if(first == null || second == null || first.length() != second.length())  // if the size of the string is huge this is a good idea "first.length() != second.length()"
            return false;

        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2 = first.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

// SOLUTION 2 - O(n log(n))
public static boolean areAnagram2(String first, String second) {
    if (first == null || second == null)
      return false;

    final int ENGLISH_ALPHABET = 26;
    int[] frequencies = new int[ENGLISH_ALPHABET];

    first = first.toLowerCase();
    for (var i = 0; i < first.length(); i++)
      frequencies[first.charAt(i) - 'a']++;

    second = second.toLowerCase();
    for (var i = 0; i < second.length(); i++) {
      var index = second.charAt(i) - 'a';
      if (frequencies[index] == 0)
        return false;

      frequencies[index]--;
    }

    return true;
  }
}