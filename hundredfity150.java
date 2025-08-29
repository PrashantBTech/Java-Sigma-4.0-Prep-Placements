//  Heaps
// 1. Insertion 
// 2. peek - get min

import java.util.ArrayList;

public class hundredfity150 {
    
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        
        public void add(int data){  // logn
            // add
            arr.add(data);

            int x = arr.size()-1;  // child idx
            int par = (x-1)/2;  // par idx

            while (arr.get(x) < arr.get(par)) {
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }

        public int peek(){
            return arr.get(0);
        }
    }
}
