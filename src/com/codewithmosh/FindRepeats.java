package com.codewithmosh;

import java.util.HashSet;
import java.util.Set;

public class FindRepeats {

    public char findRepeat(String str){
        Set <Character> set = new HashSet<>(  );

        for (char ch : str.toCharArray()){
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;

    }
}
