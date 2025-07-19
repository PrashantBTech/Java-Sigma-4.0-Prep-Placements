// Check for a given string of parentheses str = ({[]}) is valid or not using stack
// O(n)  - TC

import java.util.Stack;

public class hunderdfive105 {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {// opening
                s.push(ch);
            } else {
                if (s.isEmpty()) { // ")))}]" no opening bracket
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || // ()
                        (s.peek() == '[' && ch == ']') || // []
                        (s.peek() == '{' && ch == '}') // {}
                ) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "([{}])";
        String str2 = "({)})";
        String str3 = ")))}]";

        System.out.println(str1 + " : " + isValid(str1));
        System.out.println(str2 + " : " + isValid(str2));
        System.out.println(str3 + " : " + isValid(str3));

    }
}
