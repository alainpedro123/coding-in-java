// MAIN CLASS
package com.alainafonso;

public class Main {

    public static void main(String[] args) {
	    var numbers = new Array(3);
	    numbers.insert(1);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.removeAt(3);
        numbers.print();
        System.out.println(numbers.indexOf(30));

    }
}


// ARRAY CLASS
package com.alainafonso;

public class Array {
    private int [] data;
    private int count;

    public Array(int length){  // constructor
        data = new int[length];
    }

    public void insert(int item){
        // if the array is full resize it, double it size
        if(data.length == count){
            int [] newArray = new int[count * 2];  // create a new array (twice the size)

            for(int i = 0; i < count; i++)   // copy all existing items to the new array
                newArray[i] = data[i];

            data = newArray;    // set newArray to the "data"

        }

        // adding the new item at the end
        data[count] = item;
        count++;
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index > count)
          throw new IllegalArgumentException();

        resizeIfRequired();

        for (int i = count - 1; i >= index; i--)
          items[i + 1] = items[i];

        items[index] = item;
        count++;
    }

    private void resizeIfRequired() {
        if (items.length == count) {
          int[] newItems = new int[count * 2];

          for (int i = 0; i < count; i++)
            newItems[i] = items[i];

          items = newItems;
        }
    }

    public void removeAt(int index){
        if(index <0 || index >= count )
            throw new IllegalArgumentException();

        // shift the items to the left
        for(int i = index; i < count; i++)
            data[i] = data[i+1];

        count--;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++)
            if(data[i] == item)
                return i;

        return -1;

    }

    public void reverse() {
        int[] newItems = new int[count];

        for (int i = 0; i < count; i++)
          newItems[i] = items[count - i - 1];

        items = newItems;
    }

    public Array intersect(Array other) { // takes another array and returns all the common items of both arrays.
        var intersection = new Array(count);

        for (int item : items)
          if (other.indexOf(item) >= 0)
            intersection.insert(item);

        return intersection;
    }

    public void print(){
        for(int i = 0; i < count; i++)
            System.out.println(data[i]);
    }
}