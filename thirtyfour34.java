// Program for selection sort 

public class thirtyfour34 {
    public static void selectionsort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minpos =i;
            for(int j=i+1;j<arr.length; j++){
                if (arr[minpos]>arr[j]) {
                    minpos=j;
                }
            }
            // swap
            int t= arr[minpos];
            arr[minpos]= arr[i];
            arr[i]= t;
        }
    }
    public static void printarray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionsort(arr);
        printarray(arr);
    }
}
// time complexity = O(n^2)