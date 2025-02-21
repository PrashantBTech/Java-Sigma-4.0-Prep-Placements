//sum of the subarrays of an array and finding the Max.Sum

public class twenty9 {

    // The Brute Force approach
    public static void substringSum(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum =0;
        for(int i=0;i<number.length; i++){
            for (int j =i; j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(+number[k]+" " );// subarrays
                    currsum+=number[k];
                   
                }
                System.out.println("Sum: "+currsum);
                System.out.println();
                if(maxsum<currsum){
                    maxsum = currsum;
                }
               
            }
            
        }
        System.out.println("MAX SUM : "+ maxsum);
    }// time complexity is O(n^3)

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        substringSum(arr);
    }
}
