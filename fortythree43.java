//substring in java program

public class fortythree43 {
    public static String substring(String str, int si, int ei){
        String substrr="";
        for (int i = si; i < ei; i++) {
            substrr +=str.charAt(i);
        }
        return substrr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5));

        // in java there existe a prebuild function of substring 
        System.out.println(str.substring(0, 5));
    }
}
