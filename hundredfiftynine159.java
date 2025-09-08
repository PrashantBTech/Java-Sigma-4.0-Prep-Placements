//      Hash Sets

import java.util.*;
public class hundredfiftynine159 {
    public static void main(String[] args) {
       HashSet<String> cities = new HashSet<>();
       cities.add("Delhi"); 
       cities.add("Mumbai"); 
       cities.add("Noida"); 
       cities.add("Bengaluru"); 
       cities.add("Himachal");
       
       System.out.println(cities);
 
       // iteration of hashSet 
       //- <a> using iterators
            // Iterator it = cities.iterator();
            // while (it.hasNext()) {
            //     System.out.println(it.next());
            // }
        // <b> using advanced loops
        for (String city : cities) {
            System.out.println(city);
        }

        // Linked HashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
       lhs.add("Delhi"); 
       lhs.add("Mumbai"); 
       lhs.add("Noida"); 
       lhs.add("Bengaluru"); 
       lhs.add("Himachal"); 

       System.out.println(lhs);

       // Tree Set -> Ascending order sorted
       TreeSet<String> ts = new TreeSet<>();
       ts.add("Delhi"); 
       ts.add("Mumbai"); 
       ts.add("Noida"); 
       ts.add("Bengaluru"); 
       ts.add("Himachal"); 
 
       System.out.println(ts);
    }
}
