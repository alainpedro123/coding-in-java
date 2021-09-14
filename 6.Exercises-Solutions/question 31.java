// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        String removeDuplicates = StringManipulation.removeDuplicates("Heeelllo");
        System.out.println(removeDuplicates);
    }
}


// REMOVE DUPLICATES

package com.alainafonso;

import java.util.HashSet;
import java.util.Set;

public class StringManipulation {
    public static String removeDuplicates(String string){
        if(string == null)
            return "";

        Set<Character> set = new HashSet<>();
        var output = new StringBuilder();

        for(var letter : string.toCharArray())
            if(!set.contains(letter)){
                set.add(letter);
                output.append(letter);
            }
    return output.toString();
    }
}