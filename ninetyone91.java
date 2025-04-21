// Check if Linked List is Palindrome

public class ninetyone91 {
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

    // -------------------------------------------------------------------------------

    public Node findMid(Node head) { // using slow-fast approach
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // middle node

    }

    public boolean Checkpalindrome(){
        if (head == null || head.next == null) {
            return true;
        }
        // find middle
        Node mid = findMid(head);
        // reverse 2nd half
        Node curr = mid;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        // check if equal
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ninetyone91 ll = new ninetyone91();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.Printll();
        System.out.println(ll.Checkpalindrome());
    }
}
