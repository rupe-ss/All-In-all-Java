package collectionframework.collection.list;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        //Declare Arraylist in multiple ways
        ArrayList al = new ArrayList();

        //Restrict arrayList from adding all kind of data-type
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);

        //Adding elements in Arraylist. add method
        al.add("Apple");
        al.add("Ball");
        al.add(1000);
        al.add('A');
        al.add(3);

        //Printing ArrayList
        System.out.println("Printing arrayList after adding group of elements: " + al);

        //Check the size of an ArrayList
        System.out.println(al.size());

        //Clear the ArrayList
        arrayList.clear();
        System.out.println(arrayList);

        //Check if ArrayList is empty
        System.out.println(al.isEmpty());

        //Adding element by providing index
        al.add(3, 2000);
        System.out.println("Printing arrayList after adding a element by providing index and element: " + al);

        //Removing element by providing index
        al.remove(2);
        System.out.println("Printing arrayList after removing a element by providing index: " + al);

        //Removing element by providing object
        al.remove("Apple");
        System.out.println("Printing arrayList after removing a element by providing object: " + al);

        //Find the index of element
        int index = al.indexOf(3);
        System.out.println("Printing index on an element:" + index );

        //Checking if Collection contains provided element or not
        System.out.println(al.contains('A'));
        System.out.println(al.contains("None"));

        ArrayList al2 = new ArrayList<>();
        al2.add("Ball");
        al2.add(3000);
        al2.add('C');

        //Adding collection on an Arraylist
        al.addAll(al2);
        System.out.println("Printing arrayList after adding a collection " + al);

        //Removing collection from an ArrayList. When removing a collection using removeAll() method it will remove the element that is duplicate in collection.
        al.removeAll(al2);
        System.out.println("Printing arrayList after removing a collection " + al);

        //Removing all elements from collection except the one that is provided in parameter matches with the collection
        al2.add('A');
        al2.add(2000);
        System.out.println(al2);
        System.out.println(al.retainAll(al2));
        System.out.println("Printing arrayList after retaining a collection " + al);

        //Replace the value of ArrayList
        al.set(0, 5000);
        System.out.println("Printing arrayList after replacing the first element: " + al);

    }
}
