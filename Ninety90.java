// Linked List

// Adding a node in Linked List,  TC: O(1)
// printing the linked list, TC : O(n)
// Removing node from Linked List
// Iterative Search , TC:O(n)
// Recursive Search,
// Reversing the Linked List, TC: O(n)
//Find and remove Nth node from End

public class Ninety90 {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head; // Head Pointer , points to first node
    public static Node tail; // Tail Pointer , points to last node
    public static int size;

    public void addFirst(int data) {
        // Step1 => create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 => newNode next = head
        newNode.next = head;

        // step3 => head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add_bw(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void Printll() {
        if (head == null) {
            System.out.println("Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        // prev : i = size -2
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itr_Search(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) { // TC:O(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int rec_Search(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void delete_Nth_fromEnd(int n) {
        // calculate size;
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        // remove head, first node
        if (n == sz) {
            head = head.next;
            return;
        }
        // sz-n
        int i = 1;
        int itofind = sz - n;
        Node prev = head;
        while (i < itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        Ninety90 ll = new Ninety90();
        ll.addFirst(2);
        ll.addFirst(1);
        /*
         * head -> [2] -> [1] -> null
         * ↑
         * tail
         */
        ll.addLast(4);
        ll.addLast(5);
        ll.add_bw(2, 3);
        ll.Printll();
        System.out.println("Size of Linked List: " + ll.size);

        ll.removeFirst();
        ll.Printll();
        ll.removeLast();
        ll.Printll();
        System.out.println("Size of Linked List: " + ll.size);

        System.out.println("Iterative Searching in Linked List at idx: " + ll.itr_Search(3));
        System.out.println("Iterative Searching in Linked List at idx: " + ll.itr_Search(10));

        System.out.println("Recursive Searching in Linked List at idx: " + ll.rec_Search(4));

        ll.reverse();
        ll.Printll();

        ll.addLast(1);
        ll.addLast(5);
        ll.Printll();

        ll.delete_Nth_fromEnd(3);
        ll.Printll();

    }
}
