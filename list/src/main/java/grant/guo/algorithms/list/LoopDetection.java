package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;
import sun.awt.image.ImageWatched;

import java.util.Enumeration;
import java.util.Stack;

/**
 * Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
 * beginning of the loop.
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
 * as to make a loop in the linked list.
 * EXAMPLE
 * Input:
 * Output:
 * SOLUTION
 * A - > B - > C - > D - > E - > C [the same C as earlier]
 * C
 */
public class LoopDetection {

    public static void main(String[] args) {
        LinkedElement A = new LinkedElement(Character.getNumericValue('A'), null);
        LinkedElement B = new LinkedElement(Character.getNumericValue('B'), null);
        LinkedElement C = new LinkedElement(Character.getNumericValue('C'), null);
        LinkedElement D = new LinkedElement(Character.getNumericValue('D'), null);
        LinkedElement E = new LinkedElement(Character.getNumericValue('E'), null);
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
        E.next = C;


        Stack<LinkedElement> stack = new Stack<>();

        LinkedElement p = A;

        while(p != null) {
            if(stack.size() != 0) {
                if( checkStack(stack, p) ){
                    System.out.println("looped");
                    break;
                }
            }
            stack.push(p);
            p = p.next;
        }
    }

    private static boolean checkStack(Stack<LinkedElement> stack, LinkedElement element) {
        Enumeration<LinkedElement> iterator = stack.elements();
        while(iterator.hasMoreElements()){
            if(iterator.nextElement() == element)
                return true;
        }
        return false;
    }
}
