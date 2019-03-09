package grant.guo.algorithms.queue;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;

public class CircularQueue<T> extends AbstractQueue<T> {

    private T[] array = null;

    private int head = -1;
    private int tail = -1;

    public CircularQueue(int size) {
        array = (T[])new Object[size];
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.asList(array).iterator();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean offer(T t) {
        if(isFull())
            return false;
        else {
            if(head == -1) {
                head++;
            }
            array[++tail] = t;
            return true;
        }
    }

    @Override
    public T poll() {
        if(head == tail)
            return null;
        else{
            return array[head--];
        }
    }

    @Override
    public T peek() {
        if(head == tail)
            return null;
        else
            return array[head];
    }

    private boolean isFull() {
        if(tail+1==head)
            return true;
        if(head == 0 && tail==array.length-1)
            return true;
        return false;
    }
}
