public class nine{
    public static void main(String[] args) {
        // reverse a number and store it in a variable
        // we will use formyla rev = (rev*10)+lastdigit
        int n=10899;
        int rev =0;
        while(n>0){
            int lastdigit = n%10; // gives last number
            n = n/10; // removes last number
            rev =(rev * 10)+lastdigit; 
            
        }
        System.out.print(rev);

    }
}