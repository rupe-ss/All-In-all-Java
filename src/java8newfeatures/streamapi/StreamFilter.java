package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamFilter {
    public static void main(String[] args) {
        /*
        Let's practice something I have learned before.
        Let's get sum of number that are divisible by 5. How to do it ?
        We can't use for loop because
         */
        List<Integer> list = Arrays.asList(13, 15, 76, 45, 50);
        int result = 0;
        for(int i : list){
            if(i % 5 == 0)
                result += i;
        }
        System.out.println(result);

        //We can do same thing using stream api, which is internal iteration and much faster.
        System.out.println(list.stream().filter(i -> i % 5 == 0).reduce(0,Integer::sum));

        /*
        Just like map() method let's see how filter method() works.
        We can see filter takes Object of Predicate interface and return stream Object. So, let's create object of Predicate.
         */
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 3 == 0;
            }
        };
        list.stream().filter(p).forEach(System.out::println);
    }
}
