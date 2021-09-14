package com.alainafonso;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String string = "a green apple";
        System.out.println(firstNonRepeatingCharacter(string));
    }

    public static char firstNonRepeatingCharacter(String string){
        Map<Character, Integer> map = new HashMap<>();
        
        // Breaking the String apart into characters and adding these characters
        var characterArray = string.toCharArray();

        // Iterate over the array to Hash map as the "key" and their appearance number as the "value".
        for (var character : characterArray) { // we cannot iterate over a String in Java. We must convert it into a character Array.
            var appearanceNumber = map.containsKey(character) ? map.get(character) : 0;
            map.put(character, appearanceNumber + 1);
        }

        for(var character: characterArray)
            if(map.get(character) == 1)     // if the value = 1
                return character;           // we return this character as the first repeating character

        return Character.MIN_VALUE;  // Return none - Null
    }
}