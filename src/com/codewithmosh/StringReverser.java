package com.codewithmosh;

import java.util.Stack;

public class StringReverser {

    public String reverse(String input){
        Stack<Character> stack = new Stack<>();

        for(char letter : input.toCharArray()){
            stack.push(letter);
        }
        StringBuffer reversed = new StringBuffer(  );
        while(!stack.empty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
