package InterviewPractice.CombineArrays;

import java.util.Arrays;

public class CombineArrays {

    private static int[] combineArray(int[] array1, int[] array2){
        int array[] = new int[array1.length + array2.length];
        // using the pre-defined function arraycopy
        System.arraycopy(array1, 0, array, 0, array1.length);
        System.arraycopy(array2, 0, array, array1.length, array2.length);
        return array;
    }

    private static int[] combineArraysWithoutPredefinedMethods(int[] array1, int[] array2){
        int array[] = new int[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            array[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++){
            array[array1.length + i] = array2[i];
        }
        return array;
    }

    private static int[] concateTwoArraysInAlternativeWays(int[] array1, int[] array2){
        int l = array1.length + array2.length;
        int[] array = new int[l];
        for(int i = 0, j = 0; i+j < l;){
            if(i < array1.length){
                array[i+j] = array1[i++];
            }
            if(j < array2.length){
                array[i+j] = array2[j++];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {66,77,99,44,22,11,33};
        System.out.println(Arrays.toString(combineArray(a,b)));
        System.out.println(Arrays.toString(combineArraysWithoutPredefinedMethods(a,b)));
        System.out.println(Arrays.toString(concateTwoArraysInAlternativeWays(a,b)));
    }
}
