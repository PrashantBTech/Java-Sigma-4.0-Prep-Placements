// Reversing a String using a Stack

import java.util.Stack;

public class hunderdone101 {

    public static String reverseStr(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(reverseStr(str));
    }
}
