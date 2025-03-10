//Check if a number is power of 2 or not (2^n)

public class forty48 {
    public static boolean ispower(int n){
        return (n &(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(ispower(8));
    }
}