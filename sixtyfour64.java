// 5.>  Print Nth fabonacci number

public class sixtyfour64 {
    public static int fab(int n){
        if (n==0 || n==1) {
            return n;
        }
        int fnmo = fab(n-1);
        int fnmt = fab(n-2);
        int  f = fnmo + fnmt;
        return f;
    }
    public static void main(String[] args) {
        int a=25;
        System.out.println(fab(a));
    }
}
// O(n) : Space Complexity
//O(2^n) : Time Complexity