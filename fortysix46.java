public class fortysix46 {
    // Get i th bit 
    public static int getbit(int n , int i){
        int bitmask =1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    // Set i th bit
    public static int setbit(int n, int i){
        int bitmas = 1<<i;
        return n | bitmas;
    }

    // clear i th bit
    public static int clearbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    // Update i th bit
    public static int updatebit(int n , int i, int newbit){
        // if(newbit==0){
        //     return clearbit(n, i);
        // }else{
        //     return setbit(n, i);
        // }
        
        n= clearbit(n,i);
        int bitmask = newbit<<i;
        return n|bitmask;
    }

    // // clear i th bits
    public static int clearithbits(int n, int i){
        int bitMask = (~0)<<i;
        return n&bitMask;

    }

    public static void main(String[] args) {
        System.out.println(getbit(10, 2));

        System.out.println(setbit(10, 2));

        System.out.println(clearbit(10, 1));

        System.out.println(updatebit(10, 2, 1));

        System.out.println(clearithbits(15 , 2));
    }
}
