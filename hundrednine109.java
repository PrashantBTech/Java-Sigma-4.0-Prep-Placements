// Implementing Circular queue using arrays
// here the remove operation will also take place in O(1)

import java.util.Queue;

public class hundrednine109 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue full");
                return;
            }

            if (front == -1) { // 1st element
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }

           int result = arr[front];
          
           // last element
           if (rear == front) {
            rear = front = -1;
           }else{
             front = (front+1)%size;
           }
           
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];

        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("removed "+q.remove());
        q.add(4);
        System.out.println("removed "+q.remove());
        q.add(5);

       
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
