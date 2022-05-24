package java8newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
We know lamda expression now, so forEach is Lamda Expression too.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(new Integer[]{1,2,3,4,5}));
        // ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList({1,2,3,4,5}); //We can't do something like this because we need to send object of an array or bunch of numbers.
        /*
        Let's talk about how forEach Lamda Expression works. To use Lamda Expression we need Functional Interface, and Consumer is an Functional Interface.
        We, can see we have to pass Object of Consumer in forEach() method.
         */

        /*arrayList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });*/

        //ArrayList.java have function  name forEach that takes parameter od Object Consumer (Consumer<? super E> action)
        arrayList.forEach(integer -> System.out.println(integer));

    }
}
