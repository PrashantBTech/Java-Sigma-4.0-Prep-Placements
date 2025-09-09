//  Count Distinct Elements - > uses HashSet in O(n)
// {4,3,2,5,6,7,3,4,2,1} => {4,3,2,5,6,7,1} => ans is 7

import java.util.*;
public class hundredsixty160 {
    public static void main(String[] args) {
        int nums[] = {4,3,2,5,6,7,3,4,2,1};

        HashSet<Integer> set = new HashSet<>();

        for (Integer num : nums) {
            set.add(num);
        }
        System.out.println("ans = "+set.size());
    }
}
