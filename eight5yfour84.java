// Swap two numbers in ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class eight5yfour84 {

    public static void swap(ArrayList<Integer>list, int indx1, int indx2){
        int t = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, t);

    }

    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        int indx1 = 1 , indx2 = 3;
        System.out.println("List before Swapping :  "+list);
        swap(list, indx1, indx2);
        System.out.println("List after Swapping at index 1 & 3 :  "+list);
        
        Collections.sort(list);
        //  For descending :  Collections.sort(list, Collections.reverseOrder());
        System.out.println("The sorted list : "+ list);

    }
}
