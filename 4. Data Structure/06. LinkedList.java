// MAIN CLASS

package com.alainafonso;

public class Main {

    public static void main(String[] args) {
        var linkedList = new LinkedList();
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(50);
        linkedList.prepend(10);
        var array = linkedList.toArray();
        System.out.println(Arrays.toString(array));

        System.out.println(linkedList.getKthFromTheEnd(3));
    }
}


// LINKED LIST IMPLEMENTATION CLASS 

package com.alainafonso;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void prepend(int item){
        var node = new Node(item);

        if(isEmpty())
            head = tail = node;
        else{
            node.next = head;
            head = node;
        }
        size++;
    }
    public void append(int item){
        var node = new Node(item);

        if(isEmpty())
            head = tail = node;
        else{  
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(head == tail)    // checking there's only a single item in this list
            head = tail = null;
        else{
            var second = head.next;
            head.next = null;
            head = second;
        }

        size--;
    }

    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(head == tail)
            head = tail = null;
        else{
            var previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }

        size--;
    }

    public int size(){
        return size;
    }

    public  int indexOf(int item){
        int index = 0;
        var current = head;
        while(current != null ){
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = head;
        var index = 0;
        while (current != null) {
            array[index] = current.value;
            current = current.next;
            index++;
        }

        return array;
    }

    public void reverse(){
        if(isEmpty())
            return;

        var previous = head;
        var current = head.next;
        while(current != null){     // in each iteration we want to have reference to the node after the current node
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        tail = head;
        tail.next = null;
        head = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();

        var first = head;
        var second = head;
        for (int i = 0; i < k - 1; i++) {
            second = second.next;
            if (second == null)
                throw new IllegalArgumentException();
        }
        while (second != tail) {
            first = first.next;
            second = second.next;
        }
        return first.value;
    }

    public void printMiddle() {
    if (isEmpty())
      throw new IllegalStateException();

    var a = first;
    var b = first;
    while (b != last && b.next != last) {
      b = b.next.next;
      a = a.next;
    }

    if (b == last)
      System.out.println(a.value);
    else
      System.out.println(a.value + ", " + a.next.value);
  }

  public boolean hasLoop() {
    var slow = first;
    var fast = first;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast)
        return true;
    }

    return false;
  }

  public static LinkedList createWithLoop() {
    var list = new LinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);

    // Get a reference to 30
    var node = list.last;

    list.addLast(40);
    list.addLast(50);

    // Create the loop
    list.last.next = node;

    return list;

    /*
        Check to see if a linked list has a loop.
        
        var list = LinkedList.createWithLoop();
        System.out.println(list.hasLoop());

    */
  }

    private Node getPrevious(Node node) {
        var current = head;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
}

// JAVA BUILT-IN LINKED LIST CLASS

package com.alainafonso;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        var linkedList = new LinkedList();
        linkedList.addFirst(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(5);
        linkedList.remove(1);

        System.out.println(linkedList.contains(10));
        System.out.println(linkedList.indexOf(10));
        System.out.println(linkedList.size());
        System.out.println(linkedList);

        var array = linkedList.toArray();       // converting LinkedList to Array
        System.out.println(Arrays.toString(array));
    }
}