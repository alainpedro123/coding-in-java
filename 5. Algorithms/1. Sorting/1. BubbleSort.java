// MAIN CLASS

package com.alainafonso;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = { 7, 3, 1, 4, 6, 2, 3 };
        var sorter = new BubbleSort();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

// BUBBLE SORT CLASS
package com.alainafonso;

public class BubbleSort {
    public void sort(int[] array) {
        for (var i = 0; i < array.length; i++)
            for (var j = 1; j < array.length - i; j++)
                if (array[j] < array[j - 1]){
                    var temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
    }
}
