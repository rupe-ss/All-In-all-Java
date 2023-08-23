package LeetCode.EASY.Question101SymmetricTree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isNodesSymmetric(root.left, root.right);

    }

    private boolean isNodesSymmetric(TreeNode n1, TreeNode n2){
        //1st Case: If both nodes are null then return true
        if(n1 == null && n2 == null) return true;
        //2nd Case: If one of the node is null and another is !null then return false
        if(n1 == null || n2 == null) return false;
        //3rd Case: If val is same then keep the recursive running

        return n1.val == n2.val && isNodesSymmetric(n1.left, n2.right) && isNodesSymmetric(n2.left, n1.right);
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
