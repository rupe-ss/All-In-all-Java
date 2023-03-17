package arraymethods;

public class DefinedArrays {
    public static void main(String[] args) {

        //How to make an array with int
        int[] intArrays = {1,2,3,4,5};
        printIntArray(intArrays);

        //Another way of making array with int
        int[] intArraysOne = new int[] {6,7,8,9,10};
        printIntArray(intArraysOne);

        //Another way to define fixed array, if you define array and not add any number than it will add default number as 0
        int[] intArrayTwo = new int[5];
        intArrayTwo[0] = 1;
        printIntArray(intArrayTwo);
    }

    public static void printIntArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < (array.length-1)){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
