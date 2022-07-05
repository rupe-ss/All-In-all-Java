package collectionframework.collectionVastika;

import java.util.ArrayList;
import java.util.List;

public class BasicMethodsOfList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        boolean arrayAdd = arrayList.add("Element1");
        System.out.println(arrayAdd);
        arrayList.add(1, "Element2");
        for (String s : arrayList) {
            System.out.println(s);
        }
        arrayList.forEach(list -> System.out.println(list));
        System.out.println(arrayList.size());
    }
}
