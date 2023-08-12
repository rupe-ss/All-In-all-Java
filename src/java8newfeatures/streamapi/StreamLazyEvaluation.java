package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamLazyEvaluation {
    public static void main(String[] args) {
        //Creating List of integers
        List<Integer> list = Arrays.asList(7,15,34,67,30,45);

        /*
        //Filtering integers from list that is divisible by 5
        List<Integer> divisibleByFive = list.stream().filter(i -> i % 5 == 0).collect(Collectors.toList());
        System.out.println(divisibleByFive);
        */

        //Inside filter() method and map() method instead of Lambda expression, I am passing reference method to see how many times these methods runs.
        Integer findFirst = list.stream()
                                .filter(StreamLazyEvaluation::divisibleByFive)
                                .map(StreamLazyEvaluation::doubleInteger)
                                .findFirst()
                                .orElse(0);
        System.out.println(findFirst);

        //If we see the output we will see filter method runs twice and map method runs only once.

    }

    private static boolean divisibleByFive(int i){
        System.out.println("Inside divisibleByFive");
        return i % 5 == 0;
    }

    private static int doubleInteger(int i){
        System.out.println("Inside doubleInteger");
        return i * 2;
    }
}
