package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;
import grant.guo.algorithms.list.common.ListUtils;

/**
 * Consider a singly linked list whose nodesare numbered starting at 0. Define the evenodd
 * merge of the list to be the list consisting of the even-numbered nodes followed
 * by the odd-numbered nodes.
 */
public class EvenOddMerge {

    public static void main(String[] args) {
        LinkedElement list = ListUtils.generateList();

        LinkedElement even = list;
        LinkedElement odd = list.next;
        LinkedElement first_even = list;
        LinkedElement first_odd = odd;

        list = odd.next;

        boolean currIsEven = true;
        while(list != null) {
            if(currIsEven) {
                even.next = list;
                even = list;
            }
            else{
                odd.next = list;
                odd = list;
            }
            list = list.next;
            currIsEven = !currIsEven;
        }
        even.next = first_odd;
        odd.next = null;


        while(first_even != null) {
            System.out.print(first_even.value + ",");
            first_even = first_even.next;
        }
    }
}
