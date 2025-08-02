// Greedy Approach
// Chocola Problem Code
// compute the minimal cost of braking the whole chocolate into squares.

import java.util.*;

public class hundredtwentysix126 {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 };// n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // pointers
        int hp = 1, vp = 1; // horizontal and vertical pieces , 1 as of single piece
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            // vertical cost < horizontal cost
            if (costVer[v] <= costHor[h]) { // horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
                // horizontal cost < vertical cost
            } else { // vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;

            }
        }

        // left over

        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("min cost of cuts: " + cost);

    }
}
