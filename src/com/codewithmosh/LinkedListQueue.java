package com.codewithmosh;


// Build a queue using a linked list from scratch.
// Implement the following operations and calculate their runtime complexities.

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedListQueue {
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
    }

    private Node first;
    private Node last;
    private int count;

    public void enqueue(int item) {

        Node node = new Node( item );
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();
        int value;
        if (first == last) {
            value = first.value;
            first = last = null;
        } else {
            Node second = first.next;
            value = first.value;
            first.next = null;
            first = second;

        }
        count--;
        return value;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException(  );
        return first.value;
    }

    @Override
    public String toString(){
        ArrayList<Integer> list = new ArrayList<>();
        Node curr =first;
        while(curr!=null){
            list.add(curr.value);
            curr=curr.next;
        }
        return list.toString();

    }
}
