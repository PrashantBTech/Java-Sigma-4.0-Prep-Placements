// Finding MAX SUM SUBARRAY using KADANE'S ALGORITHM
// Special case when all the numbers are negative
// Time complexity is O(n)

public class thirty30 {
    public static void kadane(int number[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<number.length;i++){
            cs = cs+number[i];
            if(cs<0){
                cs =0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("MAX SUM: "+ms);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
    }
}
