package LeetCode.Question1TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PracticeTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,4,5,8}, 9)));
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if(map.containsKey(num)) return new int[]{i, map.get(num)};
            else map.put(nums[i], i);
        }
        throw new IllegalStateException("Match not found");
    }
}
