public class seventeen {
    // factorial of a number
    public static int facto(int q) {
        int f = 1;
        for (int i = 1; i <= q; i++) {
            f = f * i;
        }
        return f;  // Move the return outside the loop
    }

    public static void main(String[] args) {
        System.out.println(facto(5));  // This will print 120
    }
}
