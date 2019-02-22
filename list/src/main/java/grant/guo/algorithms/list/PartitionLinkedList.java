package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;

/**
 *
 * Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
 * before all nodes greater than or equal to x. If x is contained within the list the values of x only need
 * to be after the elements less than x (see below). The partition element x can appear anywhere in the
 * "right partition"; it does not need to appear between the left and right partitions.
 * EXAMPLE
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */

public class PartitionLinkedList {
    public static void main(String[] args) {

        Integer comp = 5;

        LinkedElement head = new LinkedElement(
                3,
                new LinkedElement(
                        5,
                        new LinkedElement(
                                8,
                                new LinkedElement(
                                        5,
                                        new LinkedElement(
                                                10,
                                                new LinkedElement(
                                                        2,
                                                        new LinkedElement(
                                                                1,
                                                                null
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        LinkedElement p = head;
        LinkedElement sep = null;

        // find the first value which is larger than or equals to x
        while(p != null && p.value < comp) {
            p = p.next;
        }
        sep = p; // set the separator to the first value which is larger or equals to x

        // if any rest value is smaller than x, exchange the current value with sep.value so that moving the larger value to the right half
        // then move sep pointer to next
        while(p != null) {
            if(p.value < comp) {
                //exchange sep.value and p.value
                Integer inter = sep.value;
                sep.value = p.value;
                p.value = inter;
                sep = sep.next;
            }
            p = p.next;
        }

        // print the results
        p = head;
        while(p != null){
            System.out.println(p.value);
            p = p.next;

        }



    }
}
