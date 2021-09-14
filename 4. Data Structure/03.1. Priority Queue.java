// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(4);
        queue.add(10);

        System.out.println(queue);
    }
}

// PRIORITY QUEUE CLASS

package com.alainafonso;

import java.util.Arrays;

public class PriorityQueue {
    private int [] data = new int[5];
    private int count;

    public void add(int item){
        if(isFull()){
            int [] newArray = new int[count * 2];

            for(int i = 0; i < count; i++)
                newArray[i] = data[i];

            data = newArray;
        }

        var i = shiftItemsToInsert(item);
        data[i] = item;
        count++;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (data[i] > item)
                data[i + 1] = data[i];
            else
                break;
        }
        return i + 1;
    }

    public int remove(){ // remove the last item of the queue
        if(isEmpty())
            throw new IllegalStateException();

        count--;
        return data[count];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == data.length;
    }

    @Override
    public String toString(){
        var copy = Arrays.copyOfRange(data, 0, count);
        return Arrays.toString(copy);
    }
}
