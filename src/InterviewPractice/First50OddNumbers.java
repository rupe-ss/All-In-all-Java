package InterviewPractice;

import java.util.Arrays;

public class First50OddNumbers {

    private static int[] oddNumbers(){
        int i = 0;
        int[] oddNums = new int[50];
        int num = 101;
        while(i < 50){
            oddNums[i++] = num;
            num += 2;
        }
        return oddNums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(oddNumbers()));
        System.out.println(oddNumbers().length);
    }
}
