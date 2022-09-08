package java8newfeatures.streamapi;

import java.util.stream.Stream;

public class JavaStreamIteratingExample {
    public static void main(String[] args) {
        Stream.iterate(2, element-> element + 1)
                .filter(element -> element%5 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
