package java8newfeatures.functionalProgramming.function;

import java.util.function.Function;

public class MapFunction {
    public static void main(String[] args) {
        //I am going to write core Java function and using Core Java and Functional Programming
        System.out.println(increment(5));
        System.out.println(incrementFunction.apply(5));
    }

    //Regular Java function
    private static int increment(int num){
        num += 1;
        return num;
    }

    //Functional Programming "Interface Function"
    static Function<Integer, Integer> incrementFunction = number -> number + 1;
}
