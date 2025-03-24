// Factorial program using recursion

public class sixtytwo62 {
    public static int Fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = Fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(Fact(n));
    }

}
