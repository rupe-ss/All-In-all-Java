package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class DoubleValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        list.forEach(DoubleValue::doubleIt);

        /*
        Lets use enhance for loop to add all the numbers in list.
        Below we got the output but result value is changes almost 6 times, meaning lot of mutation is happening already.
        This will slow down the process.
         */
        /*int result = 0;
        for(Integer i: list){
            result += i;
        }
        System.out.println(result)*/;

        /*
        Let's achieve same result using stream
         */
        //System.out.println(list.stream().map(i -> i * 2).reduce(0,(c,e) -> c+e));
        /*
        Let's understand how stream works. What is stream ?
        Stream return Object of stream
         */

        //Below line will give you the Object of stream.
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        Stream<Integer> stream = list.stream();
        Stream<Integer> s1 = stream.map(f);
        s1.forEach(System.out::println);

    }

    public static void doubleIt(int i){
        System.out.print(i * 2 + " ");
    }
}
