// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
    }
}


// QUEUE CLASS

// Queue Implementation using two Stacks

package com.alainafonso;

import java.util.Stack;

public class Queue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.pop();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

}


// QUEUE BUILTIN IN JAVA - Implementation by means of ArrayDeque

package com.alainafonso;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.remove();
        System.out.println(queue);
    }
}


// QUEUE BUILTIN IN JAVA - Implementation by means of LinkedList

package com.alainafonso;

import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);
    }
}

// QUEUE BUILTIN IN JAVA - Implementation by means of PriorityQueue

package com.alainafonso;

import java.util.Queue;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue2 = new PriorityQueue<>();
        
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue);
    }
}