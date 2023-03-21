package arraymethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToList {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> list1 = Arrays.stream(array).boxed().collect(Collectors.toCollection(ArrayList::new));

        list1.stream().forEach(e -> System.out.print(e + " "));

        System.out.println();
        list.stream().forEach(e -> System.out.print(e + " "));
    }
}
