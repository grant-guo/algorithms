package grant.guo.algorithms.tree;

import grant.guo.algorithms.tree.common.TreeNode;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.List;

public class KthLargestInBST {
    static public void main(String[] args) {

    }

    private static int kthLargestElementInBST(TreeNode bst, int k) {
        List<Integer> lst = new ArrayList<>();
        reverseInOrder(bst, lst, k);
        return lst.get(lst.size()-1);
    }

    private static void reverseInOrder(TreeNode root, List<Integer> list, int k) {
        if(root != null && list.size() < k) {
            reverseInOrder(root.right, list, k);
            list.add(root.value);
            reverseInOrder(root.left, list, k);
        }
    }
}
