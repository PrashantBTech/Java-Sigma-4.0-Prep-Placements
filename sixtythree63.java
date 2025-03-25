// 4.>  Print sum of first n natural numbers using recursion

public class sixtythree63 {
    public static int sum(int n){
        if (n ==1) {
            return 1;
        }
        int s = n+sum(n-1);
        return s;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(sum(n));
    }
}
