// Linked List
// Adding a node in Linked List,  TC: O(1)

public class Ninety90{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        
        }
    }

    public static Node head;  // Head Pointer , points to first node
    public static Node tail;  // Tail Pointer , points to last node

    public void addFirst(int data){
        // Step1 => create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 => newNode next = head
        newNode.next = head;

        // step3 => head = newNode
        head = newNode;
    }

    public static void main(String[] args) {
        Ninety90 ll = new Ninety90();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
/*  head -> [2] -> [1] -> null
                     ↑
                     tail
*/               
