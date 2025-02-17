import java.util.*;
public class twenty {
    // print all primes in the range
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
     public static void primerange(int n){
        for(int q=2; q<=n;q++){
            if (isprimnumber(q)) {// true
                System.out.print(q + " ");
                
            }
        }
        System.out.println();
     } 
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int g = sc.nextInt();
        primerange(g);
        
     }
}
