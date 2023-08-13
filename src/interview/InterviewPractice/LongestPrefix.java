package interview.InterviewPractice;

import java.util.Arrays;

public class LongestPrefix {

    private static String longestPrefix(String[] array){

        if(array[0].length() == 0)
            return "";

        String prefix = "";
        Arrays.sort(array);
        String firstElement = array[0];

        for(int i = 0; i < firstElement.length(); i++){
            prefix = firstElement.substring(0,i + 1);
            for(int j = 1; j < array.length; j++){
                if(array[j].substring(0,i+1).equals(prefix))
                    continue;
                prefix = firstElement.substring(0, i);
                return prefix.substring(0,i);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] array = {"Flower", "Flour", "Florine"};
        System.out.println(longestPrefix(array));
    }
}
