//  Remove Duplicates in a String using recursion  (a - z)

public class sixtyeight68 {
    public static void remDupl(String str, int idx, StringBuilder newStr, boolean map[]) {
        // Base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true) { // index of current char
            // duplicate
            remDupl(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            remDupl(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        remDupl(str, 0, new StringBuilder(""), new boolean[26]);
        // 26 because of 26 characters
    }
}
