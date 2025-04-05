//optimised Program of Bubble Sort
// Time Complexity = WC: O(n^2),  BC: O(n)

public class seventyfour74 {
public static void printarr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}

    public static void modBubblesort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i ;j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = false;
                }
            }
            if (swapped== false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        modBubblesort(arr);
        printarr(arr);

    }
}
