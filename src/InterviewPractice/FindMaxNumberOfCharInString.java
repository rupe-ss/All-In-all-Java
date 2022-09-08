package InterviewPractice;

public class FindMaxNumberOfCharInString {
    //In an given array find max number of string
    private static String maxNumberOfCharInString(String[] array){
        String maxString = "";
        int max = 0;
        for(String string: array){
            if(string.length() > max){
                max = string.length();
                maxString = string;
            }
        }
        return maxString + ": This word has maximum character. That is " + max;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Ball", "Cat", "Banana", "Zebra"};
        System.out.println(maxNumberOfCharInString(stringArray));
    }
}
