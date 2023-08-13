package LeetCode.Question1TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class QuestionNo1 {

    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
    Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    //Lets do something simple so that I don't get confused while writing code. This is O(N^2) solution.
    private static int[] simpleSolve(int[] nums, int target){
        for(int i = 0; i < nums.length; i ++){
            for(int j = 0; j < nums.length; j ++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalStateException("No match found");
    }

    //This is really good way to solve this problem. This is O(N) solution.
    private static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int num = target - nums[i];
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(num, i);
        }
        throw new IllegalStateException("No match found");
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = twoSum(nums, target);
        int[] output1 = simpleSolve(nums, target);
        System.out.println(Arrays.toString(output));
        System.out.println(Arrays.toString(output1));
    }
}
