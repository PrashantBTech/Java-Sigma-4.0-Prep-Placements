// Greedy Approach
// Indian Coins
// we are given an infinite supply of denominations [1,2,5,10,20,50,100,500,2000]
// Find the min no of coins/notes to make change for a value V.

import java.util.*;

public class hundredtwentyfour124 {
    public static void main(String[] args) {

        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder()); // reverse order only with Integer

        int count = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total min coins used: " + count);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
