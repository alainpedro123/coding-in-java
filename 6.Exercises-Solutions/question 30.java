// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var checkRotation = StringManipulation.areRotations("ABCD", "DABC"); 
        System.out.println(checkRotation);
    }
}

// COUNT VOWELS

package com.alainafonso;

public static boolean areRotations(
            String str1, String str2) {
    if (str1 == null || str2 == null)
      return false;

    return (str1.length() == str2.length() &&
            (str1 + str1).contains(str2));
  }