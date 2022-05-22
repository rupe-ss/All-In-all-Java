package stream.api;

import java.util.stream.IntStream;

public class IntegerStream {
    public static void main(String[] args) {

        //1. Integer Stream
        IntStream.range(10, 20).forEach(System.out::println);
        System.out.println("*********-----------*************");

        //2. Integer Stream with Skip
        IntStream.range(10,20)
                .skip(3) //Here, skip will skip the first 3 numbers between Range
                .forEach(number -> System.out.println(number));

        //3. Integer Stream with Sum
        System.out.println("Sum = " + IntStream.range(5, 6).sum());
    }
}
