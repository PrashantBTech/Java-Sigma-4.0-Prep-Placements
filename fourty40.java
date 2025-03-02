//Code to search in a sorted 2d matrix  {StairCase Search}

public class fourty40 {
    public static boolean staircasesearch(int matrix[][],int key){
        int row=0;
        int column =matrix[0].length-1;
        while(row<matrix.length && column >=0){
            if(matrix[row][column]==key){
                System.out.println("Key found at :"+"("+row+","+column+")");
                return true;
            }
           else if(key<matrix[row][column]){
            column--;
           }
           else{
            row++;
           }
           
        }
        System.out.println("Key Not Found");
        return false;
    }

    public static void main(String[] args) {
        int matric[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key= 33;
        staircasesearch(matric, key);

    }
}
// time complexity will be = O(n+m) 
// as {if n>>m: O(n) and if m>>n :O(m)}