// Tiling Problem
// Given a "2 * n" board and tiles of sixe "2 * 1", Count the number of ways to tile the given board using 2*1 tiles.

public class sixtyseven67 {
    public static int tilingproblem(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 = tilingproblem(n-1);
        //horizontal choice
        int fnm2 = tilingproblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(3)); //3
        System.out.println(tilingproblem(4)); // 5

    }
}
