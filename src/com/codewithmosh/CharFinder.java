package com.codewithmosh;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {

    public char  findChar(String str){
        Map<Character,Integer> map = new HashMap<>(  );


        for (char ch : str.toCharArray()){
            int count = map.containsKey( ch )? map.get(ch):0;
            map.put(ch,count+1);
        }
        for(char ch :str.toCharArray()){
            if(map.get(ch)==1)
                return ch;
        }
        return Character.MIN_VALUE;
    }
}