package Java11BeyondBasics.LanbdaExpression;

import java.util.*;

public class SortingUsingLambdaExpression {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Monica", "Bipana", "Ashu", "NabinaShre", "ShreyaNiraula", "Kat");

        //Cloning the list
        List<String> list1 = new ArrayList<>(list);
        List<String> list2 = new ArrayList<>(list);
        List<String> list3 = new ArrayList<>(list);

        //Sorting using sort() method from Collections class, here sort will be done using Natural Order
        Collections.sort(list);
        System.out.println(list);

        //Sorting using list.sort(), here we can define the Comparator ourself
        //Here sorting will done using Natural order.
        list1.sort((str1, str2)-> str1.compareTo(str2));
        System.out.println(list1);

        //Sorting with the length of string
        list2.sort((str1, str2)-> str1.length() - str2.length());
        System.out.println(list2);

        //Sorting with second character
        list3.sort((str1,str2)-> str1.charAt(1) - str2.charAt(1));
        System.out.println(list3);
    }
}
