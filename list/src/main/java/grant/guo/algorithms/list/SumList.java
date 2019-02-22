package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;
import sun.awt.image.ImageWatched;

/**
 *
 * Sum Lists: You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 * Output: 2 -> 1 -> 9. That is, 912.
 */
public class SumList {
    public static void main(String[] args) {
        LinkedElement first = new LinkedElement(
                7,
                new LinkedElement(
                        1,
                        new LinkedElement(
                                6,
                                null
                        )
                )
        );

        LinkedElement second = new LinkedElement(
                5,
                new LinkedElement(
                        9,
                        new LinkedElement(
                                2,
                                null
                        )
                )
        );

        LinkedElement ret = intToElement( elementToInt(first) + elementToInt(second) );

        while(ret != null){
            System.out.println(ret.value);
            ret = ret.next;
        }

    }

    private static int elementToInt(LinkedElement e) {
        int value = 0;
        int base = 1;
        LinkedElement p = e;
        while(p != null) {
            value += p.value * base;
            base = base * 10;
            p = p.next;
        }
        return value;
    }

    private static LinkedElement intToElement(int value) {
        if(value / 10 == 0){
            return new LinkedElement(value % 10, null);
        }
        else{
            return new LinkedElement(value % 10, intToElement(value/10));
        }
    }
}
