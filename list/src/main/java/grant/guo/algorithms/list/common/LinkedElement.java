package grant.guo.algorithms.list.common;

public class LinkedElement {
    public Integer value;
    public LinkedElement next;
    public LinkedElement(Integer v, LinkedElement n) {
        this.value = v;
        this.next = n;
    }
}