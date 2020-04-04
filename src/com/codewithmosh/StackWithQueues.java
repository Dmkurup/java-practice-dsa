package com.codewithmosh;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class StackWithQueues {
    private Queue<Integer> queue1 = new ArrayDeque<>(  );
    private Queue<Integer> queue2 = new ArrayDeque<>(  );
    private int top;


    public void push(int item){
        queue1.add(item);
    }

    public int pop(){
        for(int i=0; i<queue1.size();i++){
            queue2.add(queue1.remove());
        }
        swap();
        return queue2.remove();

    }

    public void swap(){
        Queue<Integer> temp =queue1;
        queue1=queue2;
        queue2=temp;
    }

    @Override
    public String toString(){
        return queue1.toString();
    }

    public int size() {
        return queue1.size();
    }
}
