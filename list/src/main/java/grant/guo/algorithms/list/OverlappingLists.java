package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;

/*
Given two singly linked lists there may be list nodes that are common to both. (This
may not be a bug—it may be desirable from the perspective of reducing memory
footprint, as in the flyweight pattern, or maintaining a canonical form.)
 */
public class OverlappingLists {

    public static void main(String[] args) {
        LinkedElement list1 = null;
        LinkedElement list2 = null;

        int length1 = length(list1);
        int length2 = length(list2);

        int difference = Math.abs(length1-length2);
        LinkedElement p1 = list1;
        LinkedElement p2 = list2;
        if(length1 > length2) {
            while(difference-- > 0)
                p1 = p1.next;
        }
        else if(length1 < length2) {
            while(difference-- > 0)
                p2 = p2.next;
        }

        while(p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }


    }

    private static int length(LinkedElement list) {
        int length = 0;
        while(list != null) {
            length++;
            list = list.next;
        }
        return length;
    }
}
