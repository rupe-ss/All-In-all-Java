package LeetCode;

public class Question70ClimbingStairs {

    //This is a combination problem, I need to use Combination formula.
    /*For the base cases, we can define ways[0] = 1 and ways[1] = 1. The reason for this is that there is only one way to climb to the first step (by taking one step), and there is only one way to climb to step 0 (by not taking any steps).*/

    //ways[i] = ways[i-1] + ways[i-2]

    public int climbStairs(int n) {
        if(n <= 1) return 1;

        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 2;

        for(int i = 2; i <= n; i++){
            ways[i] = ways[i-1] + ways[i-2];
        }

        return ways[n];
    }

    public static void main(String[] args) {
        Question70ClimbingStairs q1 = new Question70ClimbingStairs();
        System.out.println(q1.climbStairs(2));
    }
}
