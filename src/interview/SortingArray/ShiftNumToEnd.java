package interview.SortingArray;

import java.util.Arrays;

public class ShiftNumToEnd {

    /*
    An array is provided with integer, you need to shift that integer to an end.
    int[]arr = {3,4,5,0,0,2,7,0}
     */
    private static int[] shift(int[] arr, int num){
        int j = arr.length - 1;

        for(int i = j; i >=0; i--){
            if(arr[i] == num){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {3,4,2,5,0,2,2,7,0};
        System.out.println(Arrays.toString(shift(array, 2)));
    }
}
