package collectionframework.collectionVastika;

import java.util.ArrayList;
import java.util.List;

public class ClassAssignment {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Bryan");
        list.add("Hari");
        list.add("Ram");
        list.add("Victor");

        list.forEach(listName -> System.out.println(listName));
        list.remove((list.size()-1));

        if(list.contains("Ram")){
            list.remove("Ram");
        }
        System.out.println("*******After Removing********");
        list.forEach(listName -> System.out.println(listName));
    }
}
