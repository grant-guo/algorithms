package grant.guo.algorithms.tree;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessTree {

    public static void main(String[] args) {

        int target = 6;
        int tail = 1;
        for(int i = 1;i<=target;i++) {
            int currTail = tail;
            for(int j = currTail+1;j<=currTail+i;j++) {
                if(j == target){
                    System.out.println("it is " + i);
                    return;
                }
                else {
                    tail++;
                }
            }
        }

    }
}
