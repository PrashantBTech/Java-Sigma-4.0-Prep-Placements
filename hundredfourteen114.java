//  First non repeating Letter in a Stream of characters
// aabccxb => a-1bbbbx

import java.util.*;

public class hundredfourteen114 {
    public static void printNonRepeating(String str){
        int freq[]=new int[26]; // a-z
        Queue<Character>q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++; // index of ch

            while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");

            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str1 = "aabccxb";
        String str2 = "abcduabcd";
        System.out.println(str1);
        printNonRepeating(str1);
        System.out.println(str2);
        printNonRepeating(str2);
    }
}
