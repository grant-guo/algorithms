package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;
import grant.guo.algorithms.list.common.ListUtils;

/**
 * Write a program that takes as input a singly linked list of integers in sorted order, and
 * removes duplicates from it. The list should be sorted
 */
public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        LinkedElement list = ListUtils.generateSortedListWithDuplicates();
        LinkedElement slow = list;
        LinkedElement fast = list.next;

        while(fast != null) {
            if(slow.value != fast.value){
                slow = fast;
                fast = fast.next;
            }
            else {
                fast = fast.next;
                slow.next = fast;
            }
        }

        while(list != null) {
            System.out.print(list.value + ", ");
            list = list.next;
        }
    }
}
