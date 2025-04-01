
//Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
//Output Format
//On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .

import java.io.*;
import java.util.*;

public class hr6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim(); // Trim to remove leading/trailing spaces
        scan.close();

        // Check for empty input (to avoid printing "1" incorrectly)
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Split using non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");

        // Edge case: If split() results in an empty array, print 0
        if (tokens.length == 1 && tokens[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}

// What Does split("[^A-Za-z]+") Do?
// It splits the string wherever it finds one or more non-alphabetic characters
// (spaces, punctuation, digits, etc.).

// Only consecutive English letters (A-Z or a-z) will remain as tokens.