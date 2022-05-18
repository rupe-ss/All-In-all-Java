package learning.java.core;

import java.util.ArrayList;
import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {
        //Practice with array
        String[] stringArrays = {"a", "b", "c", "d"};
        //Is it possible to get index of array inside enhanced for loop ? Yes, but I don't think it is worth it.
        int index = 0;
        for(String array: stringArrays){
            System.out.print(array + " -> ");
            System.out.print(index++);
        }

        //ArrayList
        System.out.println();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        for(String array: arrayList){
            System.out.print(array + " ==> ");
            System.out.print(arrayList.indexOf(array) + " ");
        }
    }
}
