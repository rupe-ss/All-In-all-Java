package interview.CombineArrays;

import java.util.Arrays;

public class CombineArraysMorePractice {
    private static int[] combineWithCopyMethod(int[] array1, int[] array2){
        int[] array = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array, 0, array1.length);
        System.arraycopy(array2, 0, array, array1.length, array2.length);
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,6,7,8,9};

        System.out.println(Arrays.toString(combineWithCopyMethod(array1, array2)));
    }
}
