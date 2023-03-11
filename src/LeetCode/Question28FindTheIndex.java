package LeetCode;

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
// or -1 if needle is not part of haystack.

public class Question28FindTheIndex {

    public int strStr(String haystack, String needle) {

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public int strStrOne(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Question28FindTheIndex q1 = new Question28FindTheIndex();
        System.out.println(q1.strStr("sadbutsad", "sad"));
    }
}
