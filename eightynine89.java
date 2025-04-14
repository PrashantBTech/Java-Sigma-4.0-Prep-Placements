// Pair Sum - 2
//  Find if any pair in a Sorted and Rotated ArrayList has a target Sum 

import java.util.ArrayList;

public class eightynine89 {

    // T.C =  O(n)

    public static boolean pairSumm(ArrayList<Integer> list, int target) {
        int breakingpt = -1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakingpt = i;
                break;
            }
        }
        int lp = breakingpt + 1; // smallest
        int rp = breakingpt; // largest
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSumm(list, target));
    }
}