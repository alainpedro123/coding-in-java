package com.alainafonso;

import java.util.HashSet;
import java.util.Set;

public class HashTableExercises {
  
    public int countPairsWithDiff(int[] numbers, int difference) {
        // For a given number (a) and difference (diff), number (b) can be:
        //
        // b = a + diff
        // b = a - diff
        //
        // We can iterate over our array of numbers, and for each number,
        // check to see if we have (current + diff) or (current - diff).
        // But looking up items in an array is an O(n) operation. With this
        // algorithm, we need two nested loops (one to pick a,
        // and the other to find b). This will be an O(n^2) operation.
        //
        // We can optimize this by using a set. Sets are like hash tables
        // but they only store keys. We can look up a number in constant time.
        // No need to iterate the array to find it.

        // So, we start by adding all the numbers to a set for quick look up.
        Set<Integer> set = new HashSet<>();
        for (var number : numbers)
            set.add(number);

        // Now, we iterate over the array of numbers one more time,
        // and for each number check to see if we have (a + diff) or
        // (a - diff) in our set.
        //
        // Once we're done, we should remove this number from our set
        // so we don't double count it.
        var count = 0;
        for (var number : numbers) {
            if (set.contains(number + difference))
                count++;
            if (set.contains(number - difference))
                count++;
            set.remove(number);
        }

        // Time complexity of this method is O(n).

        return count;
    }

}
