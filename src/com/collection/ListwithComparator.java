package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListwithComparator {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(206);
        values.add(404);
        values.add(102);
        values.add(701);
        values.add(900);
        //We can do all stuff sort,reverse and shuffle but I want to sort with my own logic
        //I want to sort based on last digit, how do I do it ?
        //To achieve above we need to understand how sort works, so it use compare method in Compare method in Comparator Interface.
        //But there is not class that Implements Comparator interface so how we add a logic.

        /*//Let's create a object of Comparator with anonymous class, since sort method takes Comparator Object
        //While creating Object we need to specify the type as well just like in List.
        Comparator<Integer> c = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1%10 > 02%10 ? 1:-1; // Here 1 and -1 is swap yes = 1 and swap no = -1. Using ternary operator
            }
        };*/
        //Let's use Lamda Expression
        Collections.sort(values,(i,j)-> i%10 > j%10 ? 1:-1);

        //Printing list
        for(Integer i: values){
            System.out.print(" " + i);
        }
    }

}
