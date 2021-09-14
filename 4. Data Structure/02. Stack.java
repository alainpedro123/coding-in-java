// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println(stack.peek());
    }
}


// STACK CLASS

package com.alainafonso;

import java.util.Arrays;

public class Stack {
    private int [] data = new int[5];
    private int count;

    public void push(int item){
        if(count == data.length)
            throw new StackOverflowError();

        data[count] = item;
        count++;
    }

    public int pop(){
        if(count == 0)
            throw new IllegalStateException();

        count--;
        return data[count];
    }

    public int peek(){
        if(count == 0)
            throw new IllegalStateException();
        return data[count-1];
    }

    // returning the stack content represented as a string
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(data, 0, count);
        return Arrays.toString(content);
    }
}


// STACK BUILTIN IN JAVA

package com.alainafonso;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(2);

        System.out.println(stack);
    }
}