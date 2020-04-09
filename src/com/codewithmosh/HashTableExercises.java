package com.codewithmosh;

import java.util.*;

public class HashTableExercises {

    //Most Frequent in a numbers array
   public int mostFrequent(int[]nums){
       Map<Integer,Integer> map = new HashMap<>(  );

       //enter all nums in hashtable
       for(int num: nums){
           int count = map.getOrDefault(num,0  );
           map.put( num,count+1 );
       }

       int max=0;
       int result =nums[0];
       for(Map.Entry<Integer,Integer> item:map.entrySet()){
           if(item.getValue()>max){
               max=item.getValue();
               result=item.getKey();
           }
       }
       return result;
   }

   //.countPairsWithDif

//    Input: [1, 7, 5, 9, 2, 12, 3] K=2 Output: 4

    public int countPairsWithDiff(int[]nums,int k){

        Set <Integer> set = new HashSet<>(  );
        for(int num:nums){
            set.add(num);
        }
        int count=0;
        for(int num:nums){
            if(set.contains(num+k))
                count++;
            if(set.contains(num-k))
                count++;
            set.remove(num);
        }
        return count;
    }

    //Input: [2, 7, 11, 15] - target = 9Output: [0, 1]
    // (because 2 + 7 = 9)
    // Assume that each input has exactly one solution, and you may not use the same element twice

    public int[] twoSum(int[]nums,int target){
       Map <Integer,Integer> map = new HashMap<>(  );

       for(int i =0;i<nums.length;i++){
           int compli = target -nums[i];
           if(map.containsKey( compli ))
               return new int []{map.get(compli),i};
           map.put(nums[i],i);
       }
       return null;
    }


}
