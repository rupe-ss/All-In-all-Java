package LeetCode.EASY.Question88MergeSortedArray;

import java.util.Arrays;

public class PracticeSecond  {
    public static void main(String[] args) {
        mergeTwoSortedArray1(new int[]{1,2,50,0,0,0}, 3, new int[]{21,34,44}, 3);
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


    public static void mergeTwoSortedArray1(int[] nums1, int m, int[] nums2, int n){
        //Initializing 3 pointers
        int i = m-1, j = n-1, k = m+n -1;

        //Time complexity: O(m+n), We are iterating through both arrays once, so the time complexity is O(m+n).
        //Space complexity: O(1), We are not using any extra space, so the space complexity is O(1).
        while(j >= 0){
            if(i >=0 && nums2[j] > nums1[i]){
                nums1[k--] = nums2[j--];
            } else nums1[k--] = nums1[i--];
        }
        System.out.println(Arrays.toString(nums1));
    }

}
