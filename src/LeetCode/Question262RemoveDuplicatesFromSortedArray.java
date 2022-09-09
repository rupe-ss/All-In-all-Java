package LeetCode;

public class Question262RemoveDuplicatesFromSortedArray {
    private static int removeDuplicate(int[] nums){
        int i = 1;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[j-1])
                nums[i++] = nums[j];
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicate(nums));
    }
}
