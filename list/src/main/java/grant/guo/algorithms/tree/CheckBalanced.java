package grant.guo.algorithms.tree;

import grant.guo.algorithms.tree.common.TreeNode;

/**
 * Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of
 * this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
 * node never differ by more than one
 */
public class CheckBalanced {
    public static void main(String[] args) {
        TreeNode root = null;


    }

    private int depth(TreeNode root) {
        if(root == null)
            return 0;
        else {
            return Math.max(depth(root.right), depth(root.left)) + 1;
        }
    }

    private boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        else {
            if(Math.abs(depth(root.left) - depth(root.right)) > 1) {
                return false;
            }
            else{
                return isBalanced(root.left) && isBalanced(root.right);
            }
        }
    }
}
