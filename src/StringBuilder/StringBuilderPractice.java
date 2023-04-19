package StringBuilder;

public class StringBuilderPractice {
    public static void main(String[] args) {
        String name = "Elon Musk";

        StringBuilder stringBuilder = new StringBuilder(name);
        System.out.println(stringBuilder.reverse());

        // We can use toString() method to convert StringBuilder object to String object.
        System.out.println(stringBuilder.reverse().toString().getClass().getSimpleName());

        System.out.println(reverseString("Apple"));
    }

    // converted to character array and printed in reverse order
    static String reverseString(String str){
         char[] chars = str.toCharArray();
         int start = 0;
         int end = chars.length - 1;

         while(start < end){
             char temp = chars[start];
             chars[start] = chars[end];
             chars[end] = temp;
             start++;
             end--;
         }
         return new String(chars);
    }
}
