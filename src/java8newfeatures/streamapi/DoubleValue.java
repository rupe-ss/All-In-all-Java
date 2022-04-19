package java8newfeatures.streamapi;

import java.util.Arrays;
import java.util.List;

public class DoubleValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.forEach(DoubleValue::doubleIt);
    }

    public static void doubleIt(int i){
        System.out.print(i * 2 + " ");
    }
}
