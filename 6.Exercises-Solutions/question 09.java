// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        String reversed = StringManipulation.reverse("Blue");
        System.out.println(reversed);
    }
}

// REVERSE

package com.alainafonso;

// Solution 1
public class StringManipulation {
    public static String reverse(String string){
        if(string == null)
            return "";

        var reversed = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--)
            reversed.append(string.charAt(i));

        return reversed.toString();     // convert the object into String and return it
    }

// Solution 2
    public static String reverse(String input) {
        if (input == null)
          throw new IllegalArgumentException();

    Stack<Character> stack = new Stack<>();
    var reversed = new StringBuffer();

    for (char ch : input.toCharArray())
      stack.push(ch);

    while (!stack.empty())
      reversed.append(stack.pop());

    return reversed.toString();
  }
}