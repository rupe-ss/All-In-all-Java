package java8newfeatures.functionalProgramming.function;

import java.util.function.BiFunction;

public class Bifunction {
    public static void main(String[] args) {
        System.out.println(addTwoNumber(5, 5));
        System.out.println(addTwoNumberBiFunctional.apply(5,5));
    }

    //Regular Java Function
    private static int addTwoNumber(int a, int b){
        return a + b;
    }

    //Functional Programming - BiFunctional, using Method reference
    private static BiFunction<Integer, Integer, Integer> addTwoNumberBiFunctional = Integer::sum;

}
