package interview.PalindromeReverseString;

public class ReverseString {

    private static String reverseStringUsingStringBuilder(String string){
        //StringBuilder makes string mutable, we know string is immutable.
        return new StringBuilder(string).reverse().toString();
    }

    //Try to reverse string without using StringBuilder()
    private static String reverseStringWithoutUsingStringBuilder(String string){
        String str = "";
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            str = ch + str;
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(reverseStringUsingStringBuilder("Reverse Me"));
        System.out.println(reverseStringWithoutUsingStringBuilder("Without"));
    }
}
