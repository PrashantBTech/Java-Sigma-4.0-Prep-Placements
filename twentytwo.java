public class twentytwo {
    // decimal to Binary
    public static void binary(int decimal){
        int bin =0;
      
        int pow =0;
        while (decimal>0) {
       
            int rem= decimal%2; // only provides the remender
        
        bin=bin+(rem*(int)Math.pow(10, pow));
        pow++;
        decimal =decimal/2; //dividdes and reduces the number for next step
     }
        System.out.println(bin);
    }
  public static void main(String[] args) {
    binary(5);
  }
    
}

