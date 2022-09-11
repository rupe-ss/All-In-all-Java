package LeetCode;

import java.math.BigInteger;

public class Question67AddBinary {

    private static String addBinaryWithBigInteger(String a, String b){
        //  BigInteger(a, 2) takes "a String" and process it as a binary input. Then, add() of BigInteger adds both converted a and b.
        return (new BigInteger(a, 2)).add(new BigInteger(b, 2)).toString(2);
    }

    //  Time Complexity = O(N)
    //  Space Complexity = O(N)
    private static String addBinaryWithMath(String a, String b){

        //  String to store the result
        StringBuilder sb = new StringBuilder();

        //  Pointers to iterate over the strings
        int i = a.length() - 1, j = b.length() -1, carry = 0;

        while (i >= 0 || j >= 0) {

            int sum = carry;

            if (j >= 0)
                //  charAt(j) - '0' to get the decimal output of the ascii value at that index of string
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';

            //  Append the remainder to the sb
            sb.append(sum % 2);
            //  update carry
            carry = sum / 2;
        }
        //  After processing both strings, if carry is not 0. we append the carry to sb
        if (carry != 0)
            sb.append(carry);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        System.out.println(addBinaryWithBigInteger(a, b));
        System.out.println(addBinaryWithMath(a, b));
    }
}
