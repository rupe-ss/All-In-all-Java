package InterviewPractice;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertIntArrayToInteger {
    private static int convert(int[] array){
        StringBuilder string = new StringBuilder();
        for(int i: array){
            string.append(i);
        }
        int number = Integer.parseInt(string.toString());
        return number;
    }

    //Converting int[] array to Integer[] array using stream api
    private static Integer[] convertInteger(int[] array){
        return Arrays.stream(array)     //Stream array
                .boxed()            //Stream <Integer>
                .toArray(Integer[]::new);   //This will make a new array
    }

    private static int[] convertIntegerArrayToInt(Integer[] nums){
        int[] result = Stream.of(nums).mapToInt(x -> x).toArray();
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        Integer[] integerNums = {2,3,4,5,6};
        System.out.println(convert(numbers));
        System.out.println(Arrays.toString(convertInteger(numbers)) + "   -   " + convertInteger(numbers).getClass().getSimpleName());
        System.out.println(Arrays.toString(convertIntegerArrayToInt(integerNums)) + "   -   " + convertIntegerArrayToInt(integerNums).getClass().getSimpleName());
    }
}
