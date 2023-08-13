package LeetCode.Question9PalindromeNumber;

//Given an integer x, return true if x is a palindrome and false otherwise.
public class PracticeSecond {
    public static void main(String[] args) {
        System.out.println(palindrome(121));
        System.out.println(palindromeSecondWay(121));
    }

    private static boolean palindrome(int num){
        return String.valueOf(num).equals(new StringBuilder(String.valueOf(num)).reverse().toString());
    }

    private static boolean palindromeSecondWay(int num){
        int rev = 0;
        for(int i = num; i > 0; --i){
            rev = rev * 10 + i % 10;
        }
        if(num == rev) return true;
        return false;
    }
}
