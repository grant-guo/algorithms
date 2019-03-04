package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;
import grant.guo.algorithms.list.common.ListUtils;
import grant.guo.algorithms.list.common.Pair;

public class SinglyListPalindromic {
    public static void main(String[] args) {
        LinkedElement list = ListUtils.generatePalindromicListOddNumber();

        // get the middle element, and also check if the amount of elements traversed is odd or even
        // reverse the second half, compare it with the first half

        LinkedElement slow = list;
        LinkedElement fast = list;
        int count = 1;
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        if(count % 2 == 1) {
            slow = slow.next;
        }

        Pair ret = reverseList(slow);
        ret._2.next = null;

        // compare

        LinkedElement newHead = ret._1;
        boolean isPalindromic = true;
        while(newHead != null) {
            if(newHead.value != list.value) {
                isPalindromic = false;
                break;
            }
            newHead = newHead.next;
            list = list.next;
        }

    }

    private static Pair reverseList(LinkedElement list) {
        if(list.next == null) {
            return new Pair(list, list); // _1 is the head, _2 is the tail
        }
        else {
            Pair ret = reverseList(list.next);
            ret._2.next = list;
            return new Pair(ret._1, list);
        }
    }
}
