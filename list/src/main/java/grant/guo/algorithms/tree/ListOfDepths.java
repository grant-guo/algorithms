package grant.guo.algorithms.tree;

import grant.guo.algorithms.tree.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the nodes
 * at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
 */
public class ListOfDepths {

    public static void main(String[] args) {
        TreeNode root = null;

        ArrayList<Queue<TreeNode>> rets = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);


        while(q.size() > 0) {
            rets.add(q);
            Queue<TreeNode> cp = q;
            q = new LinkedList<>();
            for(TreeNode tn: cp) {
                if(tn.left != null)
                    q.offer(tn.left);
                if(tn.right != null)
                    q.offer(tn.right);
            }
        }
    }
}
