package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
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

        /*
        Below line will give you the Object of stream.
        Let's reduce below anonymous class to Lamda Expression
         */
        /*Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };*/
        Function<Integer, Integer> f = i -> i * 2;

        /*Stream<Integer> stream = list.stream();
        Stream<Integer> s1 = stream.map(f);*/
        //s1.forEach(System.out::println);

        /*
        All the below code works fine but let's remove some boiler plate code.
         */
        /*BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };*/
        //BinaryOperator<Integer> binaryOperator = (c,e) -> c + e;
        BinaryOperator<Integer> binaryOperator = Integer::sum;

        /*Integer sum = s1.reduce(0,binaryOperator);
        System.out.println(sum);*/

        System.out.println(list.stream().map(i -> i * 2).reduce(0,Integer::sum));
    }

    public static void doubleIt(int i){
        System.out.print(i * 2 + " ");
    }
}
