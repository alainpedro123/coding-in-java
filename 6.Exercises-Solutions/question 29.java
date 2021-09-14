// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        String reverseWordOrder = StringManipulation.reverseWords("Trees are beautiful");
        System.out.println(reverseWordOrder);

        String reverseWordOrder2 = StringManipulation.reverseWords2("Alain is Smart");
        System.out.println(reverseWordOrder2);
    }
}

// REVERSE WORDS ORDER

package com.alainafonso;

import java.util.Collections;
import java.util.Arrays;

public class StringManipulation {
    // Solution 1
    public static String reverseWords(String sentence){
        if(sentence == null)
            return "";
        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));      // convert the String Array into ArrayList and reserve the order of the words
        return String.join(" ", words);         // join the words with white space in the middle
    }

    // Solution 2
    public static String reverseWords2(String sentence){
        if(sentence == null)
            return "";

        String[] words = sentence.trim().split(" ");    // remove the white spaces around each words and then split it
        var reversed = new StringBuilder();
        for(int i = words.length -1; i >= 0; i--)
            reversed.append(words[i] + " ");

        return reversed.toString().trim();      // convert the object into String, remove the white space around it and return it
    }
}
