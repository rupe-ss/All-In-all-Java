package InterviewPractice.CombineArrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class CombineArrayWithStreamOfMethod {

    //Using Stream.of() to combine two arrays.
    private static <T, U> Object[] combine(T[] first, U[] second){
        return Stream.of(first, second)
                .flatMap(Stream::of)
                .toArray();
    }

    //Using Stream.concat() method to combine two arrays of different data type
    private static <T, U> Object[] concat(T[] array1, U[] array2){
        return Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                    .toArray();
    }

    //Convert int[] to Integer[] using for loop
    private static Integer[] convert(int[] array){
        Integer[] integerArray = new Integer[array.length];
        int index = 0;
        for(int value : array){
            integerArray[index] = value;
            index++;
        }
        return integerArray;
    }

    public static void main(String[] args) {
        String[] names = {"Parker", "John", "Ryan"};
        int[] intNumber = {10,20,30,40};
        Integer[] numbers = {1,5,10,15,20};
        System.out.println(Arrays.toString(convert(intNumber)));
        System.out.println(Arrays.toString(combine(names, convert(intNumber))));
        System.out.println(Arrays.toString(concat(names, numbers)));
    }
}
