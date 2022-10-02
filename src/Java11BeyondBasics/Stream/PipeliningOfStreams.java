package Java11BeyondBasics.Stream;

import java.util.stream.Stream;

public class PipeliningOfStreams {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,6,12,18,24,30,36,42);

        integerStream.filter( n -> { System.out.println("Filtering current element: " + n); return n % 2 == 0;})
                .map( n -> { System.out.println("Mapping current element: " + n); return n*n*n;})
                .sorted()
                .forEach(n -> System.out.println(n));

        //Streams are said to be lazy because until the terminal operation is invoked, none of the intermediate operations is executed.
        Stream<Integer> intStream = Stream.of(10,2,7,5,6,5,8,11);
        intStream.filter(n -> { System.out.println("Filtering Current Element: "+n); return n % 2 == 0; })
                .map(n -> { System.out.println("Mapping Current Element: "+n); return n * n * n; })
                .sorted();

    }
}
