package grant.guo.algorithms.stack;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class QueueViaStacks<T> extends AbstractQueue<T> {

    private Stack<T> s1 = new Stack<>();
    private Stack<T> s2 = new Stack<>();

    public static void main(String[] args) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public int size() {
        return s1.size() + s2.size();
    }

    @Override
    public boolean offer(T t) {
        s1.push(t);
        return true;
    }

    @Override
    public T poll() {
        if(s2.size() == 0)
            switchData();
        return s2.pop();
    }

    private void switchData() {
        if(s1.size() != 0 && s2.size() == 0) {
            while(s1.size() > 0) {
                s2.push(s1.pop());
            }
        }
    }

    @Override
    public T peek() {
        if(s2.size() == 0)
            switchData();
        return s2.peek();
    }
}
