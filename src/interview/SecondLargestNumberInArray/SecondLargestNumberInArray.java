package interview.SecondLargestNumberInArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        System.out.println(firstWayToFindSecondLargest(new int[]{45,67,2,123,69}));
        System.out.println(secondWayToFindSecondLargest(new int[]{45,67,2,123,69,160}));
    }

    private static int firstWayToFindSecondLargest(int[] array){
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }
            if(array[i] > secondLargest && array[i] < largest) secondLargest = array[i];
        }
        return secondLargest;
    }

    //Another way to find second large number is converting int[] array to List and using stream sorting and finding 2nd element
    private static int secondWayToFindSecondLargest(int[] array){
        List<Integer> list = Arrays.stream(array)
                                    .boxed()
                                    .collect(Collectors.toList());
        int secondLargest = list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().orElse(-1);
        return secondLargest;
    }
}
