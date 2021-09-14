// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        String capitalize = StringManipulation.capitalize("today is a beautiful day");
        System.out.println(capitalize);
    }
}

// CAPITALIZE

package com.alainafonso;

public class StringManipulation {
    public static String capitalize(String sentence){
        if(sentence == null || sentence.trim().isEmpty())
            return "";

        String[] words = sentence.trim().replaceAll(" +", " ").split(" ");
        for(var i = 0; i < words.length; i++)
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        return String.join(" ", words);
    }
}