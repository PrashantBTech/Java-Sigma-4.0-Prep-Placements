// Queue using Java Collection FrameWork
//  Queue<Integer> q = new LinkedList<>(); , because queue is interface and its object is not made

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class hundredeleven {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // or ArrayDeque
        // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
