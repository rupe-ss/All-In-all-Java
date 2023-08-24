package LeetCode.EASY;


public class Question104MaximumDepthOfBinaryTree {

    class NodeTree{
        int val;
        NodeTree left;
        NodeTree right;

        public NodeTree() {
        }

        public NodeTree(int val) {
            this.val = val;
        }

        public NodeTree(int val, NodeTree left, NodeTree right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    private int maxDepth(NodeTree root){
        // When Tree in null
        if(root == null) return 0;

        //Hypothesis
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        //Induction -> Adding one because we need to count the root(top) node as well.
        return Math.max(left, right) + 1;
    }

}
