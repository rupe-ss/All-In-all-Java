package java8newfeatures;

import java.util.StringJoiner;

public class StringJoinerFeature {

    /* String Joiner will join a String. For Example:-
    If we want to join A,B,C with every character you want to join with comma then we can use string joiner.
    We can use any symbol instead of comma.
    String Joiner is separating elements with delimiter.
    Also, we can add prefix and suffix in string joiner, meaning if we want to add "[" in the beginning and end of joiner
    then we can do that easily.
     */

    private static String stringJoiner(){
        StringJoiner sj = new StringJoiner(",","[","]");
        sj.add("A").add("B");
        sj.add("C");

        StringJoiner sj1 = new StringJoiner(":");
        sj1.add("P").add("Q");

        System.out.println(sj1);

        sj.merge(sj1);

        return sj.toString();
    }
    public static void main(String[] args) {
        System.out.println(stringJoiner());
    }
}
