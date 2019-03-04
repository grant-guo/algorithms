package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;

import static grant.guo.algorithms.list.common.ListUtils.generateList;

public class RemoveKthLastElementFromList {

    public static void main(String[] args) {
        int k = 4;
        LinkedElement list = generateList();
        LinkedElement slow = list;
        LinkedElement fast = list;

        int iter = 1;
        while(iter != k) {
            fast = fast.next;
            iter++;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        //now 'slow' points to the element to be removed
        slow.value = slow.next.value;
        slow.next = slow.next.next;

        while(list != null){
            System.out.print(list.value + ",");
            list = list.next;
        }

    }

}
