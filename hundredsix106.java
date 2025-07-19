//Program to check for a valid parenthesis string : Does it contains Duplicate Parentheses?
// TC : O(n)

import java.util.Stack;

public class hundredsix106 {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // Duplicate exisits
                } else {
                    s.pop(); // '( : second pair'
                }
            } else {
                s.push(ch); // opening , operand or operator
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.out.println(str1 + " : " + isDuplicate(str1));
        System.out.println(str2 + " : " + isDuplicate(str2));

    }
}
