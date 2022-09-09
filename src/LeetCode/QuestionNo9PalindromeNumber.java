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

    //LeetCode solution
    public static boolean IsPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            System.out.println(revertedNumber);
            x /= 10;
        }
        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
        System.out.println(leetCodeDiscussSolution(12121));
        System.out.println(IsPalindrome(12121));
    }
}
