package com.codewithmosh;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {
//    Given an integer K and a queue of integers,
// write code to reverse the order of the first K elements of the queue.
// Input:  Q = [10, 20, 30, 40, 50], K = 3Output: Q = [30, 20, 10, 40, 50]

  public static void reverser(Queue<Integer> queue,int k){

      if(k<0 || k>queue.size())
          throw new IllegalStateException(  );
      java.util.Stack<Integer> stack = new Stack <>();

      for(int i=0;i<k;i++){
          stack.push(queue.remove()); //[10,20,30] pushed first k onto a stack
      }
      while(!stack.empty()){
          queue.add( stack.pop() ); // [40,50,30,20,10]
      }

      for(int i =0; i<queue.size()-k;i++){
          queue.add(queue.remove());//[30,20,10,40,50]
      }
  }

}


