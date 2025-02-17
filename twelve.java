import java.util.*;

public class twelve {
    public static void main(String[] args) {
        // inverted star pattern
        // stars = n-i+1
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
