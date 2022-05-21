package learning.java.core;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        //Not sure why we can use Lamda Expression over here, I need to figure it out.
        arrayList.forEach(list -> System.out.println(list));
    }
}
