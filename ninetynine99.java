// Implementing Stack using Java Collection FrameWork

import java.util.Stack;

public class ninetynine99 {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("top element: "+s.peek());
        System.out.println("Stack size is "+s.size());
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
