package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(2);
        set.add(34);

        for(Integer i : set){
            System.out.print(" " + i);
        }
        System.out.println();
        //TreeSet will sort the List while HashSet won't
        Set<Integer> set1 = new TreeSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.add(2);
        set1.add(34);

        for(Integer i : set1){
            System.out.print(" " + i);
        }
    }
}
