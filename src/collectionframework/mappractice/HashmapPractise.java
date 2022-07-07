package collectionframework.mappractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapPractise {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Discord");
        map.put("rollno", "001");
        map.put("designation", "wndw");
        map.put("mobileno", "Samsung");

        // Using enhanced for loo and entrySet() to print the data.
        for(Map.Entry data: map.entrySet()){
            System.out.println(data.getKey() + ":" +data.getValue());
        }

        map.remove("rollno");

        System.out.println("************After Removing***************");

        //Traversing Map
        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
