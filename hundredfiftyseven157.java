
// Majority Element
// Given an integer array of size n, find all elements that appear more than n/3 times
import java.util.*;

public class hundredfiftyseven157 {  // O(n)

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // if (map.containsKey(nums[i])) {
            //     map.put(nums[i], map.get(nums[i]) + 1);
            // } else {
            //     map.put(nums[i], 1);
            // }

            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        // Set<Integer> keyset = map.keySet();
        for (Integer num : map.keySet()) {

            if (map.get(num) > nums.length / 3) {
                System.out.println(num);
            }
        }
    }
}
