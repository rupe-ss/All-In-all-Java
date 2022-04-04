package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
There is in build Collections class in Java.
Collections class have many methods that we can do lots of stuff with List Objects.
We can sort, reverse and shuffle so meaning List is mutable.
 */
public class ListWithCollections {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(203);
        values.add(404);
        values.add(102);
        values.add(708);
        values.add(909);
        //We can do all stuff sort,reverse and shuffle but I want to sort with my own logic
        //I want to sort based on last digit, how do I do it ?

        //Lets sort the List
        Collections.sort(values);
        Collections.reverse(values);
        Collections.shuffle(values);

        //Printing list
        for(Integer i: values){
            System.out.print(" " + i);
        }
    }
}
