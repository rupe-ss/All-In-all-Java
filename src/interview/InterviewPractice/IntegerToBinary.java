package interview.InterviewPractice;

import java.util.Arrays;

public class IntegerToBinary {

    private static int[] sortArray(int[] array){
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int num = 567;
        System.out.println(Integer.toBinaryString(num));
        int[] numbers = {2,5,7,8,12,1,2};
        System.out.println(Arrays.toString(sortArray(numbers)));
    }
}
