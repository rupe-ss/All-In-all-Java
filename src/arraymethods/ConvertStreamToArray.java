package arraymethods;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertStreamToArray {
    public static void main(String[] args) {

        // IntStream -> int[]
        int[] array = IntStream.rangeClosed(1,10).toArray();
        System.out.println(Arrays.toString(array));

        // Stream<Integer> -> int[]
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        int[] array1 = stream.mapToInt(e -> e).toArray();
        System.out.println(Arrays.toString(array1));
    }
}
