package com.codewithmosh;

public class TwoStacks {

    private int[]items;
    private int top1;
    private int top2;
   private int capacity;
//push1()
// to push in the first stackpush2() capacity =5 01234
// to push in the second stack
// pop1()pop2()isEmpty1()isEmpty2()isFull1()isFull2()

    public TwoStacks(int capacity){
        items = new int[capacity];
        top1 =-1;
        top2=capacity;
    }
    public void push1(int item){
        items[++top1]=item;
    }

    public void push2(int item){
        items[--top2]=item;
    }

    public int pop1(){
        if(items.length==0)
            throw new IllegalStateException(  );
        return items[top1--];
    }

    public int pop2(){
        if(items.length==0)
            throw new IllegalStateException(  );
        return items[top2++];
    }


}
