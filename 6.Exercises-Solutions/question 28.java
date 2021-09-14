// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        int countVowels = StringManipulation.countVowels("Hello World");
        System.out.println(countVowels);
    }
}

// COUNT VOWELS

package com.alainafonso;

public class StringManipulation {
    public static int countVowels(String string){
        if(string == null)
            return 0;

        String vowels = "aeiou";
        int count = 0;
        for(var character : string.toLowerCase().toCharArray())
            if(vowels.indexOf(character) != - 1)
                count++;
            
        return count;
    }
}
