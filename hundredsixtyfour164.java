//   Topic: HAshMap
// SubArray Sum equals to K

// sum(0,j) - sum(0,i) = sum(i+1,j)=k, is the logic used here

import java.util.*;
public class hundredsixtyfour164 {
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum, count) will be stored in HashMap
        map.put(0, 1); // we have to put initially in HashMap

        int sum =0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) { // O(n)
            sum += arr[i];
            if (map.containsKey(sum-k)) {
                ans += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}

// Provide the total no of subarrays availabe having the sum equal to k