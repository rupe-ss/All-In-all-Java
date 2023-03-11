package LeetCode;

public class Question58LengthOfLastWord {

    //My Solution
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }

    public int lengthOfLastWord1(String s) {
        int length = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                length ++;
            }
            else
                if(length > 0) return length;
        }

        return length;
    }

    public static void main(String[] args) {
        Question58LengthOfLastWord q1 = new Question58LengthOfLastWord();
        System.out.println(q1.lengthOfLastWord("Think Twice Code Once."));
        System.out.println(q1.lengthOfLastWord1("Think Twice Code Once."));
        System.out.println(q1.lengthOfLastWord1("   fly me   to   the moon  "));
        System.out.println(q1.lengthOfLastWord1("a"));
    }
}
