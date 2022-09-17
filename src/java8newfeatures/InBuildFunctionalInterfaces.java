package java8newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class InBuildFunctionalInterfaces {

    public static void main(String[] args) {

        // Function<T1,T2>: Function takes only a single argument of type T1 and returns a value of type T2.
        // Obtaining Cube of a Number Using Function<T1,T2>
        Function<Integer, Integer> function = (value)-> value*value*value;
        Integer integer = function.apply(5);
        System.out.println(integer);

        // Predicate<T>: Predicate takes only a single argument of type T and always returns a Boolean value.
        // Checking whether Age is greater than 18 Using Predicate<T>
        Predicate<Integer> predicate = (age)-> age>18;
        boolean isGreaterThan18 = predicate.test(21);
        System.out.println(isGreaterThan18);

        // BiPredicate<T1,T2>: BiPredicate takes two arguments, each of type T1 and T2, and returns a Boolean value.
        // Checking whether Experience is greater than 4 and Role is "Manager" Using BiPredicate<T1,T2>
        BiPredicate<Integer,String> checkExpRole = (exp,role)-> exp > 4 && role == "Manager";
        System.out.println(checkExpRole.test(5, "Manager"));

        //Consuming/Processing a List and Displaying its Square Using Consumer<T>
        Consumer<Integer> consumer  = (value)->System.out.println(value);
        List<Integer> randList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for(Integer i : randList)
            consumer.accept(i*i);

        //Supply 5 Random Double Values Using Supplier<T>
        Supplier<Double> generateRandom = ()-> Math.random()*100;
        for(int i=0; i<5; i++)
            System.out.println(generateRandom.get());

        //Checking whether age is greater than 18 and Returning Custom String Using Function<T1,T2>
        Function<Integer, String> funcCheckAge = (var age)->age>18?"Ok":"Not Ok";
        String result = funcCheckAge.apply(21);
        System.out.println("Is Age Ok/Not Okay: " + result);

        //The parameter age is declared using var in the above code
        //Its type will be thus inferred as Integer since the generic type is set to Function<Integer, String>
    }
}
