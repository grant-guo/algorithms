package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;
import grant.guo.algorithms.list.common.ListUtils;

/**
 * Write a program that takes as input a singly linked list and a nonnegative integer k,
 * and returns the list cyclically shifted to the right by k.
 */
public class CyclicRightShiftSinglyList {
    /**
     * find the last K elements, then change the next pointers
     */

    public static void main(String[] args) {
        LinkedElement list = ListUtils.generateList();

        LinkedElement ret = rightShift(list, 4);

        while(ret != null){
            System.out.print(ret.value + ", ");
            ret = ret.next;
        }
    }

    private static LinkedElement rightShift(LinkedElement list, int k) {
        LinkedElement slow = list;
        LinkedElement fast = list;
        int iter = 0; // here 'iter' should be set to 0 instead of 1. if set to 1, the 'slow' pointer will point to the exact element which should be shifted, in this case we can't set the new tail to null
        while(iter != k) {
            fast = fast.next;
            iter++;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // here, 'fast' points to the last element
        // and 'slow' points to the element prior to the kth last element

        fast.next = list;

        LinkedElement ret = slow.next;
        slow.next = null;
        return ret;
    }
}
