//  #BACK TRACKING
// 1>  BAcktracking in Java

public class seventyfive75 {
    public static void changeArr(int arr[], int i, int val){
        // base case
        if (i == arr.length) {
            printarr(arr); // array in base case
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        // backtracking
        arr[i] = arr[i] -2 ;
    }

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printarr(arr); // array in final case after backtracking
    }
}
// Time Complexity  :  O(n)
