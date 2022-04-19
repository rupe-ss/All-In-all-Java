package java8newfeatures.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LazyStreamApi {
    public static void main(String[] args) {
        /*
        Here, we will prove stream is faster and efficiency than for loop.
        To prove it let's create a method and we will pass that method to filter and map.
        Map and filter are lazy they will only work when result is asked. Here, findFirst() method is short-circuiting terminal operation while map and filter are intermediate operation(Lazy evaluation).
         */
        List<Integer> list = Arrays.asList(4,23,12,34,5,6); //Type Casting, wrapping

//        arrayList.stream().filter(i -> i % 3 == 0).map(i -> i * 2).findFirst().orElse(0);
        System.out.println(list.stream().filter(LazyStreamApi::isDivisible).map(LazyStreamApi::doubleIt).findFirst().orElse(0));
    }

    public static boolean isDivisible(Integer i){
        System.out.println("Method hit isDivisible");
        return i % 3 == 0;
    }

    public static Integer doubleIt(Integer i){
        System.out.println("Method hit doubleIt");
        return i * 2;
    }
}
