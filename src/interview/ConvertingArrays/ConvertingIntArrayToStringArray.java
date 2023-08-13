package interview.ConvertingArrays;

import java.util.Arrays;

public class ConvertingIntArrayToStringArray {
    //Simple way to convert int[] array to String[] array
    private static String[] convert(int[] numbers){
        String[] stringArray = new String[numbers.length];
        int index = 0;
        for(int num: numbers){
            stringArray[index] = String.valueOf(num);
            index++;
        }
        return stringArray;
    }

    //Using stream to convert int[] array to String[] array
    private static String[] covertUsingStream(int[] numbers){
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convert(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(covertUsingStream(new int[]{1,2,3,4,5})));
    }
}
