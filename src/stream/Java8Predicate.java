package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate {

    public static void main(String[] args) {

        // filter() accepts predicate as argument.
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,6,7,8,2);

        // Let's create a Predicate
        Predicate<Integer> predicate = x-> x > 2;

        List<Integer> collect = list.stream().filter(predicate).collect(Collectors.toList());

        System.out.println(collect);

    }
}
