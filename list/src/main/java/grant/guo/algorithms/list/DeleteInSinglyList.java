package grant.guo.algorithms.list;

import grant.guo.algorithms.list.common.LinkedElement;

import static grant.guo.algorithms.list.common.ListUtils.generateList;

public class DeleteInSinglyList {

    public static void main(String[] args) {
        LinkedElement list = generateList();
        LinkedElement ret1 = approach1(list, 5);
        LinkedElement iter = list;
        while(iter != null) {
            System.out.print(iter.value + ", ");
            iter = iter.next;
        }
        System.out.println();

        LinkedElement ret2 = approach2(list, 6);
        iter = list;
        while(iter != null) {
            System.out.print(iter.value + ", ");
            iter = iter.next;
        }
    }

    private static LinkedElement approach1(LinkedElement list, int value) {
        LinkedElement iter = list;
        while(iter != null && iter.value != value) {
            iter = iter.next;
        }

        iter.value = iter.next.value;

        iter.next = iter.next.next;

        return list;
    }

    private static LinkedElement approach2(LinkedElement list, int value) {
        LinkedElement iter = list;
        while(iter != null && iter.next.value != value) {
            iter = iter.next;
        }
        iter.next = iter.next.next;
        return list;
    }

}
