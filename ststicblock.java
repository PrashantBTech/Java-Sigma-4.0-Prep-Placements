import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ststicblock {
    static int B;
    static int H;
    static boolean flag = true;
    // Static Block (Runs Once When Class is Loaded)
    // Static blocks execute before the main() method when the class is loaded.

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        sc.close();
    }
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
    //If flag is true, the area is calculated and printed.
//If flag is false, nothing happens (because an error was already printed).


}
