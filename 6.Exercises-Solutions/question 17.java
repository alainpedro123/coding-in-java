// MAIN CLASS

package com.alainafonso;

public class Main {
    public static void main(String[] args) {
        boolean isPalindrome = StringManipulation.isPalindrome2("ABCA");
        System.out.println(isPalindrome);
    }
}


package com.alainafonso;

import java.util.StringBuilder;

public class StringManipulation {

    // Solution 1 - for small string
    public static boolean isPalindrome(String word){
        if(word == null)
            return false;
        
        var input = new StringBuilder(word);
        input.reverse();
        return input.toString().equals(word);
    }

    // Solution 2
    public static boolean isPalindrome2(String word){
        if(word == null)
          return false;

        int left = 0;
        int right = word.length() - 1;

        while(left < right) {
            if (word.charAt(left++) != word.charAt(right--))
                return false;
        }
        return true;
    }
}