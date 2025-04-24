// Implementing Linked List using Java Collection Framework

import java.util.LinkedList;

public class Ninetythree {
    public static void main(String[] args) {
        // create
        LinkedList<Integer>ll = new LinkedList<>();
        // add
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        ll.addFirst(0);
        // print
        System.out.println(ll);
        // remove
        ll.removeLast();
        ll.removeFirst();
        // print
        System.out.println(ll);
    }
}
