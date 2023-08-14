package LeetCode.EASY.Question88MergeSortedArray;

import java.util.Arrays;

public class PracticeSecond  {
    public static void main(String[] args) {
        mergeTwoSortedArray(new int[]{1,2,4,0,0,0}, 3, new int[]{34,21,44}, 3);
    }

    public static void mergeTwoSortedArray(int[] nums1, int m, int[] nums2, int n){
        for(int i = 0, j = m; i < n; i++){
            nums1[j] = nums2[i];
            j++;
        }
        //Time Complexity will be O((m+n)log(m+n)) because of the sort method
        // Space complexity: O(1), we are not using any extra space
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

}
