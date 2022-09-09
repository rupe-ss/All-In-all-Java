package LeetCode;

public class QuestionNo9PalindromeNumber {

    //This solution is done by me personally.
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

    //Simple and faster way to do it.
    public static boolean leetCodeDiscussSolution(int x){
        int rev = 0;
        for(int i = x; i > 0; i/= 10){
            rev = rev * 10 + (i%10);
        }
        if(rev == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
        System.out.println(leetCodeDiscussSolution(12121));
    }
}
