package java8newfeatures.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemoBasic {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5); // list will be Object of ArrayList class.
        System.out.println(list.getClass());
        list.forEach(System.out::print);
        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i <= 100; i ++){
            arrayList.add(i);
        }

        /*//External Iteration
        for(Integer array: arrayList){
            System.out.println(array);
        }*/

        arrayList.forEach(i -> System.out.print(i + " "));
        System.out.println();
        arrayList.stream().forEach(i -> System.out.print(i + " "));

        /*
        What is advantage of using Stream API ?
        1. parallelStream() will give us power to use all core in CPU, that's the benefit of using stream() and
        2.it has so many other feature like filter and more methods to process the data.
        3. Another advantage is that it has two types of method, one is intermediate methods and another is terminate methods.
            Stream are like stream of water, once you use stream you can't use stream again.
            Below is the example of intermediate method also called lazy evaluation.
        */
        System.out.println();
        arrayList.parallelStream().forEach(i -> System.out.print(i + " "));

        /*
        Below method won't print hi 100 times because there is no use of i for it won't do anything.
        But we have findFirst() method that will print "hi" one time. findFirst() is optional as well because if you filter all the odd numbers but list didn't have odd number from the beginning. So, this is the reason findFirst() is optional but there is more .orElse() method we can implement after findFirst() if there is no element.
         */
        System.out.println();
        arrayList.stream().filter(i -> {
            System.out.println("hi");
            return true;
        }).findFirst().orElse(0);

        /*
        Another thing with stream API is that we can use it again and again. Example is below
         */
        Stream<Integer> stream = arrayList.stream();
        stream.forEach(System.out::print);
        //stream.forEach(System.out::println); //This line will give exception because this stream object is already used before.
    }
}
