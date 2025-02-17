public class nineteen {
    // methods are of two types, user defined and inbuilt methods
    // 1. is useing differrent no of parameters
    // 2. is different datatype

    // program of [prime no

    
    public static boolean isprime(int n) {
        if (n==2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    // the above is not the optimised one , so
    //e will
    //write the
    //optimised  one

 public static boolean isprimnumber(int a) {
    if (a==2) {
        return true;
    }
    for (int i = 2; i <=Math.sqrt(a) ; i++) {
        if (a%i ==0) {
            return false;
        }
    }
    return true;
 }
    public static void main(String[] args) {
        System.out.println(isprime(5));
        System.out.println(isprimnumber(15));
    }

}
