package LeetCode;

import java.util.Arrays;

public class Question27RemoveElement {

    static private int removeElement(int[] nums, int val){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,4};
        System.out.println(removeElement(nums, 2));
    }
}
