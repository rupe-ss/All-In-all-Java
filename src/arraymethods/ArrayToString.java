package arraymethods;

import java.util.Arrays;

public class ArrayToString {

    public static void main(String[] args) {

        //We can convert array into string but I don't know the use of it yet.
        int[] number = {1,2,3,4,5};
        String arrayString = Arrays.toString(number);
        System.out.println(arrayString);
        System.out.println(arrayString.getClass().getName());
    }
}
