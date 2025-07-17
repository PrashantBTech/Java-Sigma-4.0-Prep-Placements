
// print the total length, check which string is greater (A,B?) and capatalize the first character of strings and concatinate them
import java.io.*;
import java.util.*;

public class HRStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int a = A.length() + B.length();
        System.out.println(a);

        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }

        String Aa = A.substring(0, 1).toUpperCase() + A.substring(1);
        String Bb = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(Aa + " " + Bb);

    }
}
