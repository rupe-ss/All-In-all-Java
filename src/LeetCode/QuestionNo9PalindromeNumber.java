package LeetCode;

public class QuestionNo9PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String num = String.valueOf(x);
        String reverse = new StringBuilder(num).reverse().toString();
        if(num.equals(reverse)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
