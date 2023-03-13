package LeetCode;

//Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

public class Question69Sqrt {

    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        int low = 1, high = x, ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(x/mid == mid) return mid;
            else if(x/mid < mid) high = mid-1;
            else {low = mid + 1; ans = mid;};
        }
        return ans;
    }

    //Linear Search
    public int mySqrtOne(int x){
        if(x == 0) return 0; //if x is equal to zero then just return zero.
        int i = 1;
        for(; i<x/i; i++) // x = 64, i = 1, 1 < 64
            if(x/i == i) return i;
        return i-1;
    }

    //lets do linear search with while
    public int mySqrtWhile(int x){
        if(x == 0) return 0;
        int i = 1;
        while(i < x/i)
            i++;
            if(x/i == i) return i;
        return i-1;
    }

    public static void main(String[] args) {
        Question69Sqrt q1 = new Question69Sqrt();
        System.out.println(q1.mySqrtWhile(64));
    }
}
