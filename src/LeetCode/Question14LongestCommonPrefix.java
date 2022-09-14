package LeetCode;

import java.util.Arrays;

public class Question14LongestCommonPrefix {

    private static String longestCommonPrefix(String[] str){
        if(str.length == 0)
            return "";

        Arrays.sort(str);

        // First element of array
        String s = str[0];
        String prefix = "";

        // For loop
        for(int i = 0; i < s.length(); i++){
            prefix = s.substring(0,i+1);
            int len = prefix.length();

            for(int j = 1; j < str.length; j++){

                //condition for other element prefix
                if (str[j].substring(0, len).equals(prefix)) {
                    continue;
                } else {
                    return prefix.substring(0, i);
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] array = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(array));
        String string = "Apple";
        System.out.println(string.substring(0,2));
    }
}
