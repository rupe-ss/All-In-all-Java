package interview.ConvertingArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertingIntArrayToList {

    private static List<Integer> convertInNaiveWay(int[] array){
        List<Integer> list = new ArrayList<>();
        for(int num: array){
            list.add(num);
        }
        return list;
    }

    //We can use Java 8 Stream to convert a primitive integer array to an Integer list.
    private static List<Integer> convertUsingStream(int[] array){
        return Arrays.stream(array)
                    .boxed()
                    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,7,8};
        System.out.println(convertInNaiveWay(numbers));
        System.out.println(convertInNaiveWay(numbers).getClass().getSimpleName());
        System.out.println(convertUsingStream(numbers));
        System.out.println(convertUsingStream(numbers).getClass().getSimpleName());
    }
}
