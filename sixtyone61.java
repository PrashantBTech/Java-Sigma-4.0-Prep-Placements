// Recursion Program 1, 2.
//Print numbers in decreasing order
//Print numbers in increasing order

public class sixtyone61 {
    //Decreasing order
    public static void decnum(int n){
        if(n ==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decnum(n-1);
    }

    //Increasing order
    public static void incnum(int n){
        if(n ==1){
            System.out.print(n +" ");
            return;
        }
        incnum(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n =10;
        decnum(n);
        System.out.println();
        incnum(n);
    }
}
