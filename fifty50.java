// using Bit Manupulation
// Program to calculate the Fast Exponential

public class fifty50 {
    public static int fastexpo(int a, int n)// a^n
    {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {// check lsb
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastexpo(3, 5));
        
        System.out.println(fastexpo(5, 3));
    }
}
