import java.util.*;
public class two {
    public static void main(String[] args){
        int a,b;
        a=4;
        b=5;
        String name = "Prashant";
        System.out.println(a+b);
        System.out.println(name);
        byte d =8;//only 256 numbers can be stored in byte{-128 to 127}
        System.out.println(d);
        System.out.println("enter name");
        boolean var= true; //only true or false
        // or */ are comments
        // input in java , import java.util.*
        Scanner sc = new Scanner(System.in);

    //String inp = sc.next();
        // next only stores uupto space , not after space
    //System.out.println("your name is ");
    //System.out.println(inp);

        // a new function for input 
        String namess= sc.nextLine();
        System.out.println(namess);

        System.out.println("enter number");
        // fror input of int
        int numm = sc.nextInt();
        System.out.println(numm);
        

       
    }
}
