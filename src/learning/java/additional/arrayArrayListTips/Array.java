package learning.java.additional.arrayArrayListTips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Array {
    public static void main(String[] args) {
        /*
        Below is the 4 different ways of defining arrays.
         */
        Integer[] iArray = new Integer[5];
        String[] sArray = {"a", "b", "c"};
        Integer[] array = new Integer[]{1,2,3,5};
        int[] array1 = {1,2,3,4,56};

        /*
        Printing array, see the difference below
         */
        int[] intArray = {1,2,3,4,5,6};
        String str = Arrays.toString(intArray);
        System.out.println(intArray); //This will print a hash value bcoz intArray is an Object.
        System.out.println(intArray.getClass().getSimpleName()); //This will print int[]
        System.out.println(str); //This will print [1, 2, 3, 4, 5, 6]
        System.out.println(str.getClass().getName()); //This will print java.lang.String
        System.out.println("Length of String 'str' = " + str.length()); //This will print 18, meaning this entire is string "[1, 2, 3, 4, 5, 6]".

        /*
        Creating an ArrayList from an array
         */
        System.out.println("***********-------------************");
        String[] strings = {"a", "b", "c", "d", "e"};
        String[] strings1 = {"a", "b", "c", "d", "e", "a"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings)); //This will change array to arrayList
        System.out.println(strings.getClass().getName()); //This will print [Ljava.lang.String; not sure what this is lol
        System.out.println(strings1.getClass().getSimpleName()); //This will print String[] , meaning array of string

        //Collection Set doesn't have a duplicate values.
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(strings1));
        arrayList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        hashSet.forEach(i -> System.out.print(i + " "));
        /*
        Check if arrays contains a certain values.
         */
        System.out.println("\n" + Arrays.asList(strings).contains("d"));
        //In collection you can check if List contains a certain value
        System.out.println(hashSet.contains("c"));
    }
}
