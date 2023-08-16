package java8newfeatures.functionalProgramming.function;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumberPredicate.test(6));
    }

    static Predicate<Integer> isEvenNumberPredicate = num -> num % 2 == 0;

    //Java regular function
    static boolean isEvenNumber(int num){
        return num % 2 == 0 ? true : false;
    }
}
