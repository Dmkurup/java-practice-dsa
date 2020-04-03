package com.codewithmosh;

import java.util.Arrays;

public class ArrayQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int count;

 public ArrayQueue(int capacity){
     arr= new int[capacity];
 }

 public void enqueue(int item){
     if (arr.length==count)
         throw new IllegalStateException();
     arr[rear]=item;
     rear=(rear+1)%arr.length;
     count++;
 }

    public int dequeue(){
        if (arr.length==count)
            throw new IllegalStateException();
        int top=arr[front];
        arr[front]=0;
        front=(front+1)%arr.length;
        count--;
        return top;

    }

    @Override
    public String toString(){
     return Arrays.toString(arr);
    }
}
