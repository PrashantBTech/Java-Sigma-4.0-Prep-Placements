public class eight {
    public static void main(String[] args) {
        int n=10899;
        while(n>0){
            int lastdigit = n%10; // gives last number
            System.out.print(lastdigit);
            n = n/10; // removes last number
        }
        System.out.println();
    }
}
