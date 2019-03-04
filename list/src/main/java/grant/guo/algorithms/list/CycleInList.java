package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;

/**
 *
 */
public class CycleInList {
    public static void main(String[] args) {
        LinkedElement head = null;

        cycleExists(head);

    }

    private static boolean cycleExists(LinkedElement element) {
        LinkedElement slow = element;
        LinkedElement fast = element;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
}
