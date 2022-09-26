package java8newfeatures.lamdaExpression;

import java.util.*;

public class SortingList {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Rachael","Ross","Monica",
                "Chandler","Joey","Phoebe");

        //Cloning the nameList for the demo
        List<String> clonedNameList1 = new ArrayList<String>(nameList);
        List<String> clonedNameList2 = new ArrayList<String>(nameList);
        List<String> clonedNameList3 = new ArrayList<String>(nameList);

        //Sorting list using natural ordered.
        Collections.sort(clonedNameList1);
        System.out.println(clonedNameList1);

        //Sorting this list using sort() method and passing reference of Comparator
        Comparator<String> stringComparator = (str1, str2)-> str1.compareTo(str2);
        clonedNameList2.sort(stringComparator);
        System.out.println(clonedNameList2);

        //Sorting the list on the basis of length of String
        Comparator<String> stringComparator1 = (str1, str2) -> str1.length() - str2.length();
        clonedNameList3.sort(stringComparator1);
        System.out.println(clonedNameList3);
    }
}
