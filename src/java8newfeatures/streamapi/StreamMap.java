package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.List;

//Understanding how map works in Stream framework
public class StreamMap {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        /*
        //Creating object of stream
        Stream s = list.stream();

        //Map take a Function object as parameter, creating a function object
        Function<Integer, Integer> f = new Function<>() {
            @Override
            public Integer apply(Integer o) {
                return o * 2;
            }
        };

        //Stream is a interface that have map() method, which will return a stream object
        Stream s1 = s.map(f);

        //Stream have reduced() method as well which takes a BinaryOperator as parameter
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer o, Integer o2) {
                return o + o2;
            }
        };

        //Stream is a interface that have reduced() method as well
        Integer result = (Integer) s1.reduce(0, binaryOperator);
        */

        /*
        //Converting Above code into Lambda Expression
        Stream s = list.stream();

        //Map take a Function object as parameter, creating a function object
        Function<Integer, Integer> f = (o) ->  o * 2;

        //Stream is an interface that have map() method, which will return a stream object
        Stream s1 = s.map(f);

        //Stream have reduced() method as well which takes a BinaryOperator as parameter
        BinaryOperator<Integer> binaryOperator =  (o, o2) -> o + o2;

        //Stream is a interface that have reduced() method as well
        Integer result = (Integer) s1.reduce(0, binaryOperator);
        */

        //Converting Above code into single line
        Integer result = list.stream().map(o ->  o * 2).reduce(0, (o, o2) -> o + o2);

        //Using Method Reference instead of reduce sum method
        Integer result1 = list.stream().map(i -> i * 2).reduce(0, Integer::sum);

        System.out.println(result);
        System.out.println(result1);
    }
}
