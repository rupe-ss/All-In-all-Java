package collectionframework.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        /*
        Below is how we create collection, but problem is collection don't have Index for each value like array.
        We can print collection but it will print all the values. How, do I print only one values at a time ?
        So, there is Iterator interface that collection extends we can use that to print one value at a time.
         */
        Collection values = new ArrayList();
        values.add(5);
        values.add(7);
        values.add(4);
        values.add(2);

        /*//next() method will give next available element in collection
        Iterator it = values.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/

        //Its hard to print one element in collection where in array we have index and enhanced for loop to print elements.
        //We can use while loop to iterate through collection
        Iterator it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //This will print all the values in the collection
        System.out.println(values);
    }
}
