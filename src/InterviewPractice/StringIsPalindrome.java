package InterviewPractice;

public class StringIsPalindrome {
    //Using StringBuilder() to check if string is palindrome or not.
    private static boolean isPalindrome(String string){
        //If we want to ignore the Case we can use equalsIgnoreCase() method
        //return new StringBuilder(string).reverse().toString().equals(string);
        return new StringBuilder(string).reverse().toString().equalsIgnoreCase(string);
    }

    //Let's check it without using the StringBuilder()
    private static boolean isPalindromeWithoutStringBuilder(String string){
        String str = "";
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            str = ch + str;
        }

        return str.equalsIgnoreCase(string);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Pop"));
        System.out.println(isPalindromeWithoutStringBuilder("Poop"));
    }
}
