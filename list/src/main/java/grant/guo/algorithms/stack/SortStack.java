package grant.guo.algorithms.stack;

import java.util.Enumeration;
import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> s1 = populateStack();
        Stack<Integer> s2 = new Stack<>();

        s2.push(s1.pop());

        while(s1.size() != 0) {
            Integer top = s1.pop();
            Integer s2_peek = s2.peek();
            if(top > s2_peek)
                s2.push(top);
            else {
                while(s2.size() > 0 && s2_peek > top) {
                    s1.push(s2.pop());
                }
                s2.push(top);
            }
        }

        while(s2.size() != 0) {
            System.out.println(s2.peek());
            s1.push(s2.pop());
        }
    }

    private static Stack<Integer> populateStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(10);
        stack.push(1);
        stack.push(100);
        stack.push(99);
        stack.push(50);

        return stack;
    }
}
