package com.codewithmosh;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
    }
    private Node first;
    private Node last;
    private int size;


    public void addLast(int value) {
        Node newLast = new Node( value );
        if (isEmpty())
            first = last = newLast;
        else {
            last.next = newLast;
            last = newLast;
        }
        size++;
    }
    public void addFirst(int value) {
        Node newFirst = new Node( value );
        if (isEmpty())
            first = last = newFirst;
        else {
            newFirst.next = first;
            first = newFirst;
        }
        size++;
    }

    public void delFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        } else {
            Node newFirst = first.next;
            first.next = null;
            first = newFirst;
        }
        size--;
    }

    public void delLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        } else {
            Node prev = getPrevious( last );
            //at this point curr should be second last...
            last = prev;
            last.next = null;
        }
        size--;
    }

    public int indexOf(int item) {
        Node curr = first;
        int index = 0;
        while (curr != null) {
            if(curr.value==item) return index;
            curr=curr.next;
            index++;
        }
        return -1;
    }


    public boolean contains(int item){
        return !(indexOf(item)==-1);
    }


    public boolean isEmpty(){
      return first==null;
    }

    public int size(){
        return size;
    }

    private Node getPrevious(Node node) {
        Node curr = first;
        while (curr != null) { //except last node..stop at prev noce
            if (curr.next == node) {
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }


    public int[] toArray(){

        int[] array = new int[size];
        Node curr=first;
        int index=0;
        while(curr!=null){
            array[index++]=curr.value;
            curr=curr.next;
        }
        return array;

    }

    public void reverse(){ //[10>20>30]

        if (isEmpty())
            return;
       Node prev =null;
       Node curr=first;

       while(curr!=null){
          Node nextNode=curr.next;
           curr.next=prev;
           prev=curr;
           curr=nextNode;
       }
       last=first;
     //  last.next=null;
       first=prev;

    }


    public int getKthNodeFromTheEnd(int k){
        if(isEmpty())
            throw new IllegalStateException( ) ;
        Node slowPtr =first;
        Node fastPtr=first;
        for (int i =0;i<k-1;i++)
            fastPtr=fastPtr.next;
            if(fastPtr==null)
                throw new IllegalArgumentException(  );

        while(fastPtr!=last){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next;
        }
        return slowPtr.value;
    }

    public void printMiddle(){
        if(isEmpty())
            throw new IllegalStateException(  );
        Node slowPtr=first;
        Node fastPtr=first;

        while(fastPtr!=last && fastPtr.next!=last){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        if(fastPtr==last)
            System.out.println(slowPtr.value);
        else{
            System.out.println(slowPtr.value+","+slowPtr.next.value);
        }
    }

    public boolean hasLoop(){
        if(isEmpty())
            throw new IllegalStateException(  );
        Node slowPtr=first;
        Node fastPtr=first;

        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;

            if(slowPtr==fastPtr)
                return true;
        }
        return false;
    }

    public static LinkedList createWithLoop() {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Get a reference to 30
        Node node = list.last;

        list.addLast(40);
        list.addLast(50);

        // Create the loop
        list.last.next = node;

        return list;
    }

}
