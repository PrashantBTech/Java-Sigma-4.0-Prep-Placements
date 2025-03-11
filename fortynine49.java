//program to count set bits in a number {count of 1bit in a number}

public class fortynine49 {
    public static int countsetbits(int n){
        int count = 0;
        while(n>0){
            if((n & 1)!= 0){count++;} // Check out Lsb
            n = n>>1;
        }
       return count;
    }
    public static void main(String[] args) {
        System.out.println(countsetbits(10));
    }
}
