// Find Next greater element in an array using stack in O(n)

import java.util.Stack;

public class hundredfour104 {

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};

        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) { // O(n)
            // 1. while loop

            while (!s.isEmpty() && arr[s.peek()]<= arr[i]) {
                s.pop();
            }
            // 2. if and else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            }
            else{
                nxtGreater[i]= arr[s.peek()];
            }
            // 3. push index
            s.push(i);
        }

        // for printing answer
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i]+",");
        }System.out.println();
    }
}
