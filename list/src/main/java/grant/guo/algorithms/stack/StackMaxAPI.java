package grant.guo.algorithms.stack;

import java.util.Stack;

public class StackMaxAPI {

    private static class Element<T>{
        T value;
        T max;
        public Element(T v, T m) {
            this.value = v;
            this.max = m;
        }
    }

    public static class StackWithMax<T extends Comparable<T>> {
        private Stack<Element<T>> stack = new Stack<>();

        public T push(T t) {
            if(stack.size() == 0)
                stack.push(new Element<>(t, t));
            else {
                if(t.compareTo(stack.peek().max) > 0) {
                    stack.push(new Element<>(t, t));
                }
                else
                    stack.push(new Element<>(t, stack.peek().max));
            }
            return t;
        }

        public T pop() {
            return stack.pop().value;
        }

        public T peek() {
            return stack.peek().value;
        }

        public T max() {
            return stack.peek().max;
        }
    }

    public static void main(String[] args) {
        Stack<Element> stack = new Stack<>();
    }
}
