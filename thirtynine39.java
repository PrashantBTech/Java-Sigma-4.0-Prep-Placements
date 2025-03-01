// Program for calculating the Sum Of Diagonals in 2d array

public class thirtynine39 {
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            // Sum of primary diagonal
            sum += matrix[i][i];
            // sum of secondary matrix
            if (i != matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];
                // as we know i+j = n-1 so, j=  matrix.length-1-i
                
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix1[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int matrix2[][]={
            {1,2,3},
            {5,6,7},
            {9,10,11},
        };
        System.out.println(diagonalsum(matrix1));
        System.out.println(diagonalsum(matrix2));
    }
}
// Time Complexity:O(n)