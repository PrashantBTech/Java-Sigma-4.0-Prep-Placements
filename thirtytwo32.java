// Buy and sell stocks program
// you are given an array where prices[i] is the price of a given stock on the ith day . You want to maaximize your profit by choosing a single day to buy one stock and chosing a different day in the future to sell that stack. Return the maximum profit you can achieve from this transaction . If you cannot achieve any profit , return 0.

public class thirtytwo32 {
    public static int buysellStocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice<prices[i]) {// profit
                int profit = prices[i]-buyprice;// todays profit
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]= {7,1,5,3,6,4};
        System.out.println(buysellStocks(prices));
    }
}
