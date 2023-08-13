package interview.SecondLargestNumberInArray;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        System.out.println(firstWayToFindSecondLargest(new int[]{45,67,2,123,69}));
    }

    private static int firstWayToFindSecondLargest(int[] array){
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] > largest) largest = array[i];
            if(array[i] > secondLargest && array[i] < largest) secondLargest = array[i];
        }
        return secondLargest;
    }
}
