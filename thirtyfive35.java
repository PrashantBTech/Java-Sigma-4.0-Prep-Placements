// program for insertion sort 

public class thirtyfive35 {
    public static void insertionsort(int arr[]){
        for(int i =1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            // finding the correct position
            while(prev>=0 && arr[prev]>curr){// by changing {arr[prev]<curr} this condition we can change the order of sort
                arr[prev+1]= arr[prev];
                prev--;
            }// Insertion
            arr[prev+1]= curr;
        }
    }

    public static void printarray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionsort(arr);
        printarray(arr);
    }
}
// time complexity is O(n^2)