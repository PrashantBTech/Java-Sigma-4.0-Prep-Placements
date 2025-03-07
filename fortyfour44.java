// Program of String compression: aaabbccc  -> a3b2c3

public class fortyfour44 {
    public static String stringCompress(String strings){
            String newstr="";
            for (int i = 0; i < strings.length(); i++) {
                Integer count=1;
                while (i<strings.length()-1 && strings.charAt(i)==strings.charAt(i+1)) {
                    count++;
                    i++;
                }
                newstr+= strings.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str="aaabbbccdd";
        System.out.println(stringCompress(str));
    }
}

