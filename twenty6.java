// reverse an array without extra space
 // we swap numbers in pairs 
public class twenty6 {
    
    public  static void rev(int arr[]){
       int first =0;
        int last = arr.length-1;
      
        while(first<last){
            // swap
            int temp = arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last --;
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        rev(arr);
        // printing our array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
