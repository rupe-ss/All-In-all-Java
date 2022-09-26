package Java11BeyondBasics.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperationOnStream {

    public static void main(String[] args) {

        List<String> places = new ArrayList<>();
        places.add("Ohio");
        places.add("Kentucy");
        places.add("Oregon");
        places.add("Washington");
        places.add("Tennesse");
        places.add("Florida");
        places.add("Tokyo");
        places.add("Denton");

        //forEach() : This method is used to traverse each element of the stream. It is used mainly to display the elements in a Stream.
        places.forEach(place -> System.out.print(place + " "));
        System.out.println();
        places.forEach(System.out::print);

        //map() :  This method is used to return a new stream based on operations done on an existing stream.
        System.out.println();
        places.stream().map(place -> place.toUpperCase()).forEach(place-> System.out.print(place + " "));

        //filter() : This method is used to return a new filtered stream based on conditions given for filtering.
        System.out.println();
        places.stream().filter(place -> place.length() == 6).forEach(place -> System.out.print(place + " "));

        // sorted() : This method is used to sort the elements in a Stream.
        System.out.println();
        places.stream().sorted().forEach(place -> System.out.print(place + " "));

        System.out.println();
        places.stream().sorted((str1, str2) -> str1.compareTo(str2)).forEach(place-> System.out.print(place + " "));

        System.out.println();
        places.stream().sorted((str1, str2) -> str1.length() - str2.length()).forEach(place-> System.out.print(place + " "));

        // collect() : This method stores the modified stream as a new collection type (it can be list, map etc.), after the stream operation terminates, under a new identifier
        System.out.println();
        List<String> placeList = places.stream().map(place -> place + " State").collect(Collectors.toList());
        placeList.forEach(place -> System.out.println(place));
    }
}
