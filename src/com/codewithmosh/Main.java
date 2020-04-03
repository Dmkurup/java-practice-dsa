package com.codewithmosh;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;



public class Main {


    public static void main(String[] args) {

     LinkedList list = new LinkedList();

     String str ="abcd";
     StringReverser reverser = new StringReverser();
     String reversed = reverser.reverse( str );
     System.out.println(reversed);



        String str2 ="(1=2)";
        BalanceExpr bal = new BalanceExpr();
        System.out.println(bal.isBalanced( str2 ));


        Stack stack  = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
       // System.out.println(stack);
        stack.pop();
       // System.out.println(stack.peek());
        //stack.isEmpty()

        MinStack minstack  = new MinStack();
        minstack.push(10);
        minstack.push(5);
        minstack.push(0);
        minstack.push(1);
        System.out.println(minstack.pop());
        System.out.println(minstack.pop());
        System.out.println(minstack.min());
        minstack.min();

        Queue<Integer> queue = new ArrayDeque<>(  );
               queue.add( 10 );
               queue.add(20);
               queue.add(30);
               reverser(queue);
        System.out.println(queue);

        ArrayQueue myq =new ArrayQueue(5);
        myq.enqueue( 10 );
        myq.enqueue( 20 );
        myq.enqueue( 30 );
        myq.enqueue( 40 );
        myq.dequeue();
        myq.dequeue();
        myq.enqueue( 50 );
        myq.enqueue( 60 );
        myq.enqueue( 70 );
        System.out.println(myq);

    }

    public static void reverser(Queue<Integer> queue){
        //10 20 30 o/p 30 20 10
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.empty()){
            queue.add(stack.pop());
        }

    }






}
