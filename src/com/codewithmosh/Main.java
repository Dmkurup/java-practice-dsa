package com.codewithmosh;

import java.util.*;


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
        queue.add(40);
        queue.add(50);

        QueueReverser qr = new QueueReverser();
        qr.reverser(queue,3);
        System.out.println("hi"+queue);

       //Queue with array
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

        //Queue with stacks
        QueueWithTwoStacks queStack = new QueueWithTwoStacks();
        queStack.enqueue( 10 );
        queStack.enqueue( 20 );
        queStack.enqueue( 30 );
        queStack.enqueue( 40 );
        queStack.dequeue();

        ///Stack with Queues
        StackWithQueues stq = new StackWithQueues ();
        stq.push( 10 );
        stq.push( 20 );
        stq.push( 30 );
        System.out.println("StackwithQ"+stq.pop( ));


        //Priority Queue

        PriorityQueue pq = new PriorityQueue ();
        pq.add(1);
        pq.add(5);
        pq.add(3);
        pq.add(7);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);


        //HshMaps

        Map <Integer,String> map = new HashMap<>(  );
        map.put(1,"Mosh");
        map.put(2,"Joey");
        System.out.println(map);

//        for ( item:map.entrySet()) {
//            System.out.println(item);
//        }


        CharFinder finder = new CharFinder();
        char ch =finder.findChar( "a green apple" );
        System.out.println(ch);


        FindRepeats find = new FindRepeats();
        char ch2 =find.findRepeat( "green apple" );
        System.out.println(ch2);
    }

    public static void reverser2(Queue<Integer> queue){
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
