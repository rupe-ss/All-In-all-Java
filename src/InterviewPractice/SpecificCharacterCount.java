package InterviewPractice;

public class SpecificCharacterCount {

    //Here, in this program I am counting number of character that is not alphabet

    private static int count(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i ++){
            if(!Character.isLetter(str.charAt(i))){
                count ++;
                System.out.print(str.charAt(i) + " ");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "Interview!@#Question123";
        System.out.println("\n" + count(string));
    }
}
