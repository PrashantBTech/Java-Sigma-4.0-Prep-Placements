// Bit Manupulation: To check a number is odd or even

public class fortyfive45 {
    
    public static void evenorodd(int n){
        int bitmask  =1;
        if ((n & bitmask) == 0) {
            // even number
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        int n=5;
        evenorodd(n);
        evenorodd(8);
    }
}
