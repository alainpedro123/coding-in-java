package com.alainafonso;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		reverse(queue)
		System.out.println(queue);
	}

	public static void reverse(Queue<Integer> queue, int k) {
        if (k < 0 || k > queue.size())
            throw new IllegalArgumentException();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++)
            stack.push(queue.remove());

        while (!stack.empty())
            queue.add(stack.pop());

        for (int i = 0; i < queue.size() - k; i++)
            queue.add(queue.remove());
    }
}