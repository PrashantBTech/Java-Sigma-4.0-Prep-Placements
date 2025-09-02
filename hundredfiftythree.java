// Connect N Ropes with Minimum cost;
// Given N ropes if differebt length , the task is to connect these ropes into one rope with minimum cost,
// such that the cost to connect two ropes is equal to the sum of their lengths.

import java.util.PriorityQueue;

public class hundredfiftythree {
    public static void main(String[] args) {
        int rops[]={2,3,3,4,6}; // 41
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < rops.length; i++) {
            pq.add(rops[i]);
        }
        int cost = 0;
        while (pq.size() > 1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1+min2; // calculates the total cost
            pq.add(min1+min2); // add the final rope to pq (r1+r2)
        }
        System.out.println("cost : "+cost);
    }
}
