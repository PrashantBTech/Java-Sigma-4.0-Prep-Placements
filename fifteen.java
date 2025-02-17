import java.util.*;

public class fifteen {

    // functions in java
    public static void printHello() {
        System.out.println("Hello World");
    }

    // functions with parameters
    public static int sumb(int a, int b) { // paramaters/formal parameters
        return a + b;

    }

    public static void main(String[] args) {
        printHello();
        int t = sumb(5, 4);// argument/ actual parameters
        System.out.println("The sum is " + t);

    }

}
