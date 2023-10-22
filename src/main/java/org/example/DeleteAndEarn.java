package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class DeleteAndEarn {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

    }

    public int earnMax(int[] nums) {
        if(nums.length == 0) return 0;
        Map<Integer, Long> num = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        Map<Integer,Integer> val = new TreeMap<>();
        Map<Integer,Integer> cache = new TreeMap<>();
        for(Map.Entry<Integer, Long> s : num.entrySet()){
            val.put(s.getKey(), (int) (s.getKey()*s.getValue()));
            cache.put(s.getKey(), (int) (s.getKey()*s.getValue()));
        }
        return calculateMax(val,cache);
    }

    private int calculateMax(Map<Integer, Integer> val,Map<Integer, Integer> cache) {

        int key =0;
        int r=0;
        for(Map.Entry<Integer, Integer> e1 : cache.entrySet()) {
            int max =0;
            for (Map.Entry<Integer, Integer> e : val.entrySet()) {
                if (max < e.getValue()) {
                    max = e.getValue();
                    key = e.getKey();
                }
            }
            val.remove(key - 1);
            val.remove(key + 1);
            val.remove(key);
            r = r + max;

        }
        return r;
    }
}