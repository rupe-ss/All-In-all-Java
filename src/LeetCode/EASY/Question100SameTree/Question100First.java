package LeetCode.EASY.Question100SameTree;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Question100First {
    public static void main(String[] args) {
        List<Integer> pList = Arrays.asList(1,2,3);
        List<Integer> qList = Arrays.asList(1,2,3);

        System.out.println(pList == qList);

        System.out.println(biPredicate.test(pList, qList));


    }

    private static BiPredicate<List<Integer>, List<Integer>> biPredicate = (p, q) -> {
        boolean same = false;
        int l = p.size() > q.size() ? p.size() : q.size();
        for(int i = 0; i < l; i++){
            if(p.get(i) == q.get(i)) same = true;
            else same = false;
        }
        return same;
    };

    private static boolean areSameTree(TreeNode p, TreeNode q){

        //Base Case:- If both node are null then both Tree are same
        if(p == null && q == null) return true;

        //Another Case:- If any of the node is null or node val is different then tree is different
        if(p == null || q == null || p.val != q.val) return false;

        //Recursive Case:
        return areSameTree(p.left, q.left) && areSameTree(p.right, q.right);
    }

     //Definition for a binary tree node.
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
        }
    }
}
