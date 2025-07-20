// Maximum rectangular Area in Histogram
// Given an array of integers height representing the histogram's bar height where the width of each bar is 1, return the area of largest rectangle possible in the histogram
// using stacks
// area = height * width
// width = j-i-1; where i is next small height in left , and , j is next small height in right

// so the TC : O(n)

import java.util.Stack;

public class hunderedseven107 {

    public static void MaxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        // next smaller right : O(n)
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // nest smaller left : O(n)
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area : O(n)
        // width = nsr[i] - nsl[i] -1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Max area in histogram is : " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        MaxArea(arr);
    }

}
