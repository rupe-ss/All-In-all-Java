package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListWithGenerics {
    public static void main(String[] args) {
        //Java is type safe language so always work with it. Make List type safe as well.
        //We make List of specific type using Generics using Angular brackets or Diamond brackets.
        // List<Integer> values = new ArrayList<Integer>(); //Java 1.5 syntax
        List<Integer> values = new ArrayList<>(); //After 1.7 we can use this syntax.
        values.add(5);
        values.add(4);
        //values.add("String"); Now we can't add String

        //Even in enhance for loop to have to mention it is an Integer
        for(Integer i : values){
            System.out.println(i);
        }

    }
}
