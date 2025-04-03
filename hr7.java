//In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

//Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.
import java.util.Scanner;
import java.util.regex.*;

public class hr7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            // Write your code
            try {
                Pattern.compile(pattern); // Attempt to compile the regex pattern
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--; // Decrease the test case counter
        }
    }
}
