package InterviewPractice.PalindromeReverseString;

public class ReverseStringMorePractice {

    //Reverse String using StringBuilder
    private static String reverseString(String string){
        return new StringBuilder(string).reverse().toString();
    }

    //Reverse String without using StringBuilder
    private static String reverse(String string){
        String str = "";
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            str = ch + str;
        }
        return str;
    }

    //Checking if string is palindrome or not
    private static String checkPalindrome(String string){
        if (new StringBuilder(string).reverse().toString().equalsIgnoreCase(string)){
            return "Word - " + string + ". It is a palindrome";
        } else
            return "Word - " + string + ". It is not a palindrome.";
    }

    //Check if string is palindrome or not without using StringBuilder()
    private static String checkPalindromeWithoutStringBuilder(String string){
        String str = "";
        int index = 0;
        for(int i = 0; i < string.length(); i ++){
            char ch = string.charAt(i);
            str = ch + str;
        }
        if(str.equalsIgnoreCase(string)){
            return "Word - " + string + ". It is a palindrome";
        } else
            return "Word - " + string + ". It is not a palindrome.";
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Opapa"));
        System.out.println(reverse("Opapa"));
        System.out.println(checkPalindrome("Pop"));
        System.out.println(checkPalindromeWithoutStringBuilder("Cat"));
    }
}
