package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;
import sun.awt.image.ImageWatched;

public class ReverseSublistJava {
    public static void main(String[] args) {
        LinkedElement list = new LinkedElement(
                0,
                new LinkedElement(
                        1,
                        new LinkedElement(
                                2,
                                new LinkedElement(
                                        3,
                                        new LinkedElement(
                                                4,
                                                new LinkedElement(
                                                        5,
                                                        new LinkedElement(
                                                                6,
                                                                new LinkedElement(
                                                                        7,
                                                                        new LinkedElement(
                                                                                8,
                                                                                new LinkedElement(
                                                                                        9, null
                                                                                )
                                                                        )
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        LinkedElement ret = reverseSub(list, 4, 6);

        while(ret != null){
            System.out.print("" + ret.value + ",");
            ret = ret.next;
        }
    }

    private static LinkedElement reverseSub(LinkedElement head, int start, int end) {
        LinkedElement p1 = null;
        LinkedElement p2 = null;
        LinkedElement preStart = null;
        LinkedElement postEnd = null;
        int rolling = 0;
        LinkedElement curr = head;
        while(p1 == null || p2 == null) {
            if(rolling == start-1) {
                preStart = curr;
                p1 = curr.next;
            }
            else if(rolling == end) {
                p2 = curr;
                postEnd = curr.next;
            }
            rolling++;
            curr = curr.next;
        }

        LinkedElement ret = reverse(p1, p2);

        preStart.next = p2;
        p1.next = postEnd;

        return head;

    }

    private static LinkedElement reverse(LinkedElement start, LinkedElement end) {
        if(start.next == end) {
            end.next = start;
        }
        else {
            LinkedElement ret = reverse(start.next, end);
            ret.next = start;
        }
        return start;
    }
}