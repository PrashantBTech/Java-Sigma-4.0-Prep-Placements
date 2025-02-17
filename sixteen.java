import java.util.*;

public class sixteen {
    // call by value in java
    // swapping
    public static void swapping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapping completed !");
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }

    public static void main(String[] args) {
        swapping(5, 9);
    }
}
// in call by value the change is only seen within the function and not in the
// main function , which means "memory me change nahi hoga"