package collectionframework.collection;

import java.util.ArrayList;
import java.util.List;

/*
List extends collections, I don't understand how you can extends Interface.
I am guessing to use feature of another Interface from interface, I think we have to extends not implements because ArrayList implements List now not extends.
Below List interface have Collection features and additional features as well.
 */
public class ListInterface {
    public static void main(String[] args) {
        //
        List values = new ArrayList(); //List default type is Object
        values.add(5); //Here, 5 is not int, its Integer. Wrapper concept is used here. Integer i = new Integer(5);
        values.add(4);
        values.add(2);
        values.add(1);
        values.add("rupess"); //Since type is object we can add anything Integer or String or other data types.
        /*
        How do I insert 3 right between 4 and 2 ?
            Now with list we have a Indexing so it easy, similar to array
         */
        values.add(2, 3);

        //Using Enhance for loop to iterate the List
        for(Object o: values){
            System.out.println(o);
        }

        System.out.println(values);

    }
}
