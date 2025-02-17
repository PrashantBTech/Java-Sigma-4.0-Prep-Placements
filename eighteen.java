public class eighteen {
    //Binomial coefficient nCr
    public static int facto(int p){
        int f=1;
        for (int i = 1; i <= p;i++) {
            f= f*i;
        }
        return f;
    }
    public static int Bc(int n ,int r){
        int a= facto(n);
        int b = facto(r);
        int c =  facto(n-r);
        int z =a/(b*c);
        return z;
    }
    public static void main(String[] args) {
        int m =Bc(5, 2);
        System.out.println("the coessictent of 5,2 is "+ m);

    }
}
