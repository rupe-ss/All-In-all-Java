package java8newfeatures.interfaces;

import java.util.Arrays;
import java.util.List;

/*

//Consumer is a Functional Interface
class ConsumerImpl implements Consumer {

    @Override
    public void accept(Object o) {
        System.out.print(o + " ");
    }
}
*/

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {
        //Example of how forEach() method takes Consumer Object
        List list = Arrays.asList(5,6,7,8,9);

        /*
        //Creating Class that implements Consumer interface to understand why forEach() method takes Consumer Object
        Consumer c = new ConsumerImpl();
        list.forEach(c);
        */

        /*
        //Implementing accept() method in Consumer Functional Interface
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.print(o + " ");
            }
        };
        list.forEach(consumer);
        */

        //Passing Lambda Expression in forEach loop
        list.forEach(i -> System.out.print(i + " "));
    }
}
