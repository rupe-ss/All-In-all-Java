package InterviewPractice;

import java.util.Arrays;

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
        return Arrays.stream(array).boxed().toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        System.out.println(convert(numbers));
        System.out.println(Arrays.toString(convertInteger(numbers)) + "\n" + convertInteger(numbers).getClass().getSimpleName());
    }
}
