//  Implementing Queue Using 2 Stacks: we have two ways
// 1. where push in O(n)   or   2.  where pop in O(n)


import java.util.Stack;

public class hundredtwelve112 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() { // O(1)
            return s1.isEmpty();
        }

        public static void add(int data) { // O(n)
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

        public static int remove() { // O(1)
            if (isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        public static int peek() { // O(1)
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
