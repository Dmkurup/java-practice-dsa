package com.codewithmosh;

import java.util.Arrays;

public class Stack {

    private int[] stack =new int[5];
    private int count;

    public void push(int item){
        if(stack.length==count)
            throw new StackOverflowError(  );
//            int [] newStack = new int[count*2];
//            for (int i=0;i<count;i++ ){
//                newStack[i]=stack[i];
//            }
//            stack=newStack;

        stack[count++]=item;
    }

    public int pop(){
        if(count==0)
            throw new IllegalArgumentException(  );
        return stack[--count];
    }

    public int peek(){
        if(count==0)
            throw new IllegalArgumentException(  );
        return stack[count-1];
    }

    public boolean isEmpty(){
     return count==0;
    }

    @Override
    public String toString(){
        int[] content = Arrays.copyOfRange( stack,0,count );
       return Arrays.toString(content);
    }




}
