package InterviewPractice;

import java.util.Arrays;

import static java.util.Arrays.*;

public class SortingArray {
    public static void main(String[] args) {
        int[] array = {3,5,7,812,34};

        for(int i =0; i < array.length - 1; i ++){
            for(int j = i + 1; j < array.length ; j++){
                int temp = 0;
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
