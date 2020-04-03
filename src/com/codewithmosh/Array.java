package com.codewithmosh;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }


    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        //if index is > 0 and less than count, then valid index  [10,20,30,40,50] count 4 removeAt[1] for i =index+1, i<count;i++ items[i-1]=items[i]
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;

    }

    public int indexOf(int item) {
        //[10,20,30,40]  item=20 count=4
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }


    public int max() {
        int max = items[0];
        for (int i = 0; i < count; i++)
            if (items[i] > max) {
                max = items[i];
            }
        return max;
    }


    public void reverse() {//[10,20,30,40]
        int[] newItems = new int[count];
        for (int i = 0; i <count ; i++) {
                newItems[i] = items[count-i-1];
            }
        items = newItems;
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println( items[i] );
        }
    }


    public Array intersect(Array other){
        Array intersections = new Array(count);
        for(int i=0;i<count;i++) {
            if (other.indexOf( items[i] ) != -1) {
                intersections.insert( items[i] );
            }
        }
         return intersections;

    }
}

