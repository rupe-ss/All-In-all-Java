package InterviewPractice.SortingArray;

import java.util.Arrays;

import static java.util.Arrays.*;

public class SortingArray {

    //Quick Sort Array practice
    private static int[] quickSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3,6,1,9,45,22,45};
        int[] array1 = {3,6,1,9,45,22,99, 88, 77};

        System.out.println(Arrays.toString(quickSort(array)));

        //Sorting array using a sort method from Arrays class
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
