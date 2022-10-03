package Java11BeyondBasics.Stream;

import java.util.ArrayList;
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


        Stream<String> langNames1 = Stream.of("Java","Python","C++","C","C#","Dot Net");
        //Stream Operation #1
        langNames1.filter(name -> name.charAt(0)=='C')
                .sorted()
                .forEach(name -> System.out.println(name)); //Line1
        /*
        // Here if we uncomment below code it will through an error because we can't use stream once it is used.
        //Stream Operation #2
        langNames1.map(name -> name.toLowerCase())
                .forEach(name-> System.out.println(name));
        */

        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Below we can use twice because every time we do array.stream() nre stream is created.
        arrL.stream().forEach(num -> System.out.println(num));
        arrL.stream().filter(num -> num%2==0)
                .map(num -> num*num)
                .forEach(num -> System.out.println(num));
    }
}
