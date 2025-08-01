// Greedy Approach
//  Maximum length chain of pairs

import java.util.*;

public class hunderdtwentythree123 {

    // public static int maxPairLen(int pairs[][]){ // O(nlogn)
    
    public static ArrayList<int[]> getMaxPairChain(int[][] pairs) {

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        ArrayList<int[]> selectedPairs = new ArrayList<>();

        // Add the first pair
        selectedPairs.add(pairs[0]);
        // int chainLen = 1;
        int chainEnd = pairs[0][1]; // last selected pair end value

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                // chainLen++;
                selectedPairs.add(pairs[i]);
                chainEnd = pairs[i][1];
            }
        }

        return selectedPairs;
    }

    public static void main(String[] args) {
        int[][] pairs = {
                { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 }
        };

        ArrayList<int[]> selectedPairs = getMaxPairChain(pairs);

        // Proper printing
        for (int i = 0; i < selectedPairs.size(); i++) {
            System.out.println(Arrays.toString(selectedPairs.get(i)));
        }

        System.out.println("Max chain length: " + selectedPairs.size());
    }

}
