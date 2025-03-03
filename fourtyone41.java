// Check if a String is palindrome or not

public class fourtyone41 {
    public static boolean ispalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                // not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="racecar";
        System.out.println(ispalindrome(str));
    }
}
