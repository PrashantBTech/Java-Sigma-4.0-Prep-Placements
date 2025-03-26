//Print x to the power n using recursion
// tc = O(n)

// Optimised way
// Print x^n in O(logn)

public class sixtysix66 {
    public static int power(int x, int n){
        if(n ==0){
            return 1;
        }
        return x* power(x, n-1);
    }

    //optimised
   // C1..   x^n = x^n/2 * x^n/2 , iF n is even
   // C2..   x^n = x * x^n/2 * x^n/2 , iF n is odd

   public static int optPower(int a , int n){
    if(n ==0 ){
        return 1;
    }
    int halfpwr = optPower(a, n/2);
    int halfpwrsq = halfpwr * halfpwr;
    // n is odd
    if (n%2 != 0) {
        halfpwrsq = a *halfpwrsq;
    }
    return halfpwrsq;
   }

    public static void main(String[] args) {
        System.out.println(power(2, 10));

        System.out.println(optPower(2, 10));
    }
}
