package LeetCode;

/*Given a sorted array of distinct integers and a target value, return the index if the target is found.
  If not, return the index where it would be if it were inserted in order.
  You must write an algorithm with O(log n) runtime complexity.*/

import java.util.HashMap;
import java.util.Map;

public class Question35SearchInsertPosition {

    public int searchInsert(int[] nums, int target){
        //Since, the integer in the array is distinct
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if(target < nums[i]){
                map.put(i, target);
            }
            else {
                map.put(i, nums[i]);
            }
            if(map.containsValue(target)){
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {

        Question35SearchInsertPosition q1 = new Question35SearchInsertPosition();
        int[] array = {1,3,5,6};
        System.out.println(q1.searchInsert(array, 5));
    }
}
