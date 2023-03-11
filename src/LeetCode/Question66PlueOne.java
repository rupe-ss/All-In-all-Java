package LeetCode;

//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
// The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.

public class Question66PlueOne {

    public int[] plusOne(int[] digits){
        for(int i = digits.length - 1; i >=0; i--){
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;

        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }

    public static void main(String[] args) {
        Question66PlueOne q1 = new Question66PlueOne();
        System.out.println(q1.plusOne(new int[]{1,2,3,9}));
    }
}
