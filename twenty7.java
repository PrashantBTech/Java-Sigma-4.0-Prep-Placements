// making pairs in array in java (a,b)

public class twenty7 {
    // we will use nested loops to make pairs
    public static void pairs(int numbers[]){
        // for total pairs(formula: n(n-1)/2)
        int tp =0;
        for (int i = 0; i < numbers.length; i++) {
            int curr =numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+tp);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        pairs(arr);
    }
}
// time complexity: O(n^2)
