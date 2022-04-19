package arrayArrayListTips;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Array {
    public static void main(String[] args) {
        /*
        Below is the 3 different ways of defining arrays.
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
        System.out.println(intArray);
        System.out.println(str);

        /*
        Creating an ArrayList from an array
         */
        String[] strings = {"a", "b", "c", "d", "e"};
        String[] strings1 = {"a", "b", "c", "d", "e", "a"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strings));
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(strings1));
        arrayList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        hashSet.forEach(i -> System.out.print(i + " "));
        /*
        Check if arrays contains a certain values.
         */
        System.out.println("\n" + Arrays.asList(strings).contains("d"));
    }
}
