// Greedy Approach
// Min Absolute Difference Pairs

// Given two arrays A and B of equal length n. Pair each element of array A to an element 
//  in array B, such that sum S of Absolute Difference of all Pairs in minimum.

import java.util.*;

public class hundredtwentytwo122 {

    public static int MinSumABS(int A[], int B[]) { // O(nlogn)
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < B.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };
        System.out.println("min absolute difference of pairs : " + MinSumABS(A, B));
    }
}
