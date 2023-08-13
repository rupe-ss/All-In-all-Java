package LeetCode.EASY.Question88MergeSortedArray;

import java.util.Arrays;

public class PracticeFirst {
    public static void main(String[] args) {
        merge(new int[]{1,2,34,0,0,0}, 3, new int[]{1,2,3}, 3);
    }

    /*
    Using a arrayCopy() method from System class to copy the array. How this works
    1. You have to provide array you want to copy.
    2. Then provide the position of index. From which position you want to copy.
    3. Provide the destination array, this array will be modified.
    4. Provide the destination index which is the first position to want to start replacing.
    5. Give the length of number you want to copy from source array to destination array.
    */

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
