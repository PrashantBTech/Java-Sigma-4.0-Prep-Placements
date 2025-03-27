// check weather the two strings is Anagram

import java.util.Scanner;

public class hr5 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Create an array to store character frequencies
        int[] charCount = new int[26];

        // Count characters for first string
        for (char c : a.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Decrease count for second string
        for (char c : b.toCharArray()) {
            charCount[c - 'a']--;
        }

        // If all values in the array are 0, they are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}