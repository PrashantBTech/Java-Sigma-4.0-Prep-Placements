// binary to decimal conversion
public class twentyone {
    public static void dec(int bin){
        int mynum =bin;
        //decimal=decimal+(lastnum*Math.pow(2,pow))
        int pow =0;
        int decimal=0;
        while (bin>0) {//get last number
            int lastnum = bin%10;
            //perform operation
            decimal=decimal+(lastnum*(int)Math.pow(2,pow));
            pow++;
            //remove last num
            bin = bin/10;

        }
        System.out.println("Decimal no of "+ mynum+" is "+decimal);
    }
    public static void main(String[] args) {
        dec(101);
    }
}
