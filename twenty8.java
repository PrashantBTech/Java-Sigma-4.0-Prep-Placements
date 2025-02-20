// print subarrrays of an array in java
// eg: {1,2,3}
// output: {1}, {1,2}, {1,2,3}, {2}, {2,3}, {3}

// the formula for total subarrays is n(n+1)/2

public class twenty8 {
    public static void substring(int number[]){
        int total =0;// total no of subarrays
        for(int i=0;i<number.length; i++){
            for (int j =i; j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(number[k]+" ");// subarrays
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: "+total);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        substring(arr);
    }
}
