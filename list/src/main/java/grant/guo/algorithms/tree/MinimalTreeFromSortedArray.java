package grant.guo.algorithms.tree;

import grant.guo.algorithms.tree.common.TreeNode;

/**
 * Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an
 * algorithm to create a binary search tree with minimal height.
 */
public class MinimalTreeFromSortedArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 31};
        TreeNode node = buildTree(array, 0, array.length-1);

        System.out.println(node.value);
    }

    private static TreeNode buildTree(int[] array, int start, int end) {

        if(start == end){
            return new TreeNode(array[start], null, null);
        }
        else if(start + 1 == end){
            return new TreeNode(
                    array[end],
                    new TreeNode(array[start], null, null),
                    null
            );
        }
        else {
            int center = (start + end)/2;
            return new TreeNode(array[center], buildTree(array, start, center-1), buildTree(array, center + 1, end));
        }
    }
}
